package ReverseCharArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseCharArray {


    public char[] reverseCharArray(char[] inputChars) {

        ArrayList<Character> arrayChars = new ArrayList<Character>();
        for(char ele : inputChars){
            arrayChars.add(ele);
        }
        Collections.reverse(arrayChars);

        // inputChars = {'a', 'b', 'c', 'd', 'e'};
        int j = 0;
        for(int i = inputChars.length-1; i >= (inputChars.length/2); i--){
            char tempChar = inputChars[j];  //  a
            inputChars[j] = inputChars[i];
            inputChars[i] = tempChar;
            j++;
        }

        System.out.println(Arrays.toString(arrayChars.toArray()));
        if(arrayChars.equals(Arrays.asList(inputChars))){
            System.out.println("Truuu");
        }else{
            System.out.println("falsse");
        }

        System.out.println(Arrays.toString(inputChars));
        return inputChars;
    }
}
