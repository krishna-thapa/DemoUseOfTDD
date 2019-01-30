package ReverseString;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args){
        char[] inputChar = {'H','e', 'l', 'l','o', ' ', 'm','y',' ', 'n','a','m','e',' ','i','s', ' ','K', 'r','i','s','h','n','a'};
        int start = 0;
        int end = inputChar.length-1;
        reverseCharArray(inputChar, start, end);
        System.out.println("Reverse the whole char array: "+Arrays.toString(inputChar));

        for(int i = 0; i < end; i++){
            if(inputChar[i] ==' '){
                reverseCharArray(inputChar, start, i-1);
                start = i+1;
            }
        }

        reverseCharArray(inputChar, start, end);
        System.out.println("Result output array: "+Arrays.toString(inputChar));


        /*
        String input = "Hello my name is Krishna";
        //Output = "Krishna is name my Hello";

        String[] arrInput = input.trim().split(" ");
        int start = 0;
        for(int i = arrInput.length-1; i > (arrInput.length/2); i--){
            String temp = arrInput[start];
            arrInput[start] = arrInput[i];
            arrInput[i] = temp;
            start++;
        }
        System.out.println("Output in string Array: " + Arrays.toString(arrInput));
        */

        /*
        StringBuilder result = new StringBuilder();
        for(int i = arrInput.length-1; i >=0; i--){
            result.append(arrInput[i]);
            result.append(" ");
        }

        System.out.println("Using the StringBuilder: "+ result.toString().trim());
        */
    }

    private static void reverseCharArray(char[] inputChar, int start, int end){
        int loop = end-start;
        for(int i = 0; i <= loop/2; i++){
            char temp = inputChar[start];
            inputChar[start] = inputChar[end];
            inputChar[end] = temp;
            start++;
            end--;
        }
    }
}
