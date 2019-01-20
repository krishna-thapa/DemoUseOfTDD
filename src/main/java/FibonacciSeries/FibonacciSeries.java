package FibonacciSeries;

public class FibonacciSeries {
    public static void main(String[] args){
        int input = 10;
        //calculateFibonacci(input);
        System.out.println("Sum of the input fibonacci series number: " +
                ""+calculateFibonacci(input));
    }

    /*private static void calculateFibonacci(int input) {
        int current, secondLast=1, last=0;
        for(int i =0; i <= input; i++){
            if(i == 0) current = 0;
            else if(i == 1) current = 1;
            else{
                current = last + secondLast;
                last = secondLast;
                secondLast = current;
            }
            System.out.print(current + " ");
        }
    }*/
    private static int calculateFibonacci(int input){
        if (input == 0) return 0;
        else if (input == 1) return 1;
        else {
            return (calculateFibonacci(input - 1) + calculateFibonacci(input - 2));
        }
    }

}
