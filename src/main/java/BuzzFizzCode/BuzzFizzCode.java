package BuzzFizzCode;

public class BuzzFizzCode {

    public String checkNumber(int inputNumber){
        if(inputNumber % 15 ==0){
            return "BuzzFizz";
        }
        if(inputNumber % 3 == 0){
            return "Fizz";
        }
        if(inputNumber % 5 ==0){
            return "Buzz";
        }
        return String.valueOf(inputNumber);
    }
}
