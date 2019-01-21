package DemoExercises;

public class TapeEquilibrium {
    /**
     * For example, consider array A such that:
     *
     *   A[0] = 3
     *   A[1] = 1
     *   A[2] = 2
     *   A[3] = 4
     *   A[4] = 3
     * We can split this tape in four places:
     *
     * P = 1, difference = |3 − 10| = 7
     * P = 2, difference = |4 − 9| = 5
     * P = 3, difference = |6 − 7| = 1
     * P = 4, difference = |10 − 3| = 7
     * Write a function:
     *
     * class Solution { public int solution(int[] A); }
     *
     * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
     * return result  = 1
     */

    public static void main(String[] args){
        int[] input = {3,1,2,4,3};
        int sum = 0, difference, previous = 0, next, min = Integer.MAX_VALUE;

        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }
        System.out.println("Total sum of an array: " + sum);

        for(int i = 1; i < input.length; i++){
            previous += input[i-1];
            next = sum - previous;
            difference = Math.abs(previous - next);
            System.out.println("Difference: " + difference);

            if(min > difference){
                min = difference;
            }
        }

        System.out.println("Smallest difference: " + min);
    }


}
