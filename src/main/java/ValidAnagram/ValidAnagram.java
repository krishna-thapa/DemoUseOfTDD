package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean calculateValidAnagram(String inputS, String inputT) {
        boolean result = true;
        if(inputS.isEmpty() || inputT.isEmpty() ){
            return true;
        }
        if(inputS.length() != inputT.length()) return false;

        /*char[] charS = inputS.toCharArray();
        char[] charT = inputT.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return Arrays.equals(charS,charT);
        */

        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < inputS.length(); i++){
            char c = inputS.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i =0; i < inputT.length(); i++){
            char c = inputT.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }else{
                return false;
            }
        }


        return result;
    }
}
