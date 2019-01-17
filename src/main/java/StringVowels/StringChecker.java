package StringVowels;

import LoginCode.EmptyCredentailsDetails;

public class StringChecker {

    public int countVowels(String input) throws EmptyStringException {
        if(input.isEmpty()){
            throw new EmptyStringException("Empty input String");
        }

        String vowels = "aeiouAEIOU";
        int result = 0;

        char[] wordsChar = input.toCharArray();
        for(int i =0; i < wordsChar.length; i++){
            if(vowels.contains(wordsChar[i]+"")){
                result++;
            }
        }
        return result;
    }
}
