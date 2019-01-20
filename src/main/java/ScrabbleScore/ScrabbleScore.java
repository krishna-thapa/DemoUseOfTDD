package ScrabbleScore;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class ScrabbleScore {

    public int calculateSrabbleScore(String input) {
        char[] inputCharFirst= {'A', 'E', 'I', 'O', 'U','L', 'N', 'R', 'S', 'T'};

        //Map<Integer, char[]> map = new HashMap<>();
        //map.put(1, inputCharFirst);



        int result = 0;
        for(int j=0; j < input.length(); j++){
            for(int i =0; i < inputCharFirst.length; i++){
                if(inputCharFirst[i] == input.toUpperCase().charAt(j)){
                    result++;
                }
            }
        }
        return result;
    }
}
