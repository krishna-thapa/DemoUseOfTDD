package SecondLargestInt;


import java.util.Arrays;

public class SecondLargestInt {
    public static void main(String[] args){
        /*
        Step 1:
        Iterate the given array
        Step 2 (first if condition arr[i] > largest):
        If current array value is greater than largest value then
            Move the largest value to secondLargest and make
            current value as largest
        Step 3 (second if condition arr[i] > secondLargest )
       If the current value is smaller than largest and greater than secondLargest then the
       current value becomes secondLargest
         */

        int arr[] = {44,66,99,77,33,22,55};
        int largest = arr[0];
        int secondLargest = arr[0];

        /* There should be at least two elements */
        if(arr.length < 2){
            System.out.println("Invalid arr size");
            return;
        }
        for (Integer intValue : arr){
            if(intValue > largest){
                secondLargest = largest;
                largest = intValue;
            }
            else if(intValue > secondLargest){
                secondLargest = intValue;
            }
        }

        Arrays.sort(arr);
        int secondLargestusingArrays = arr[arr.length-2];

        //List<Integer> list=Arrays.asList(arr);
        //Collections.sort(list);
        //int element=list.get(total-2);

        System.out.println("Second largest value: "+ secondLargest);
        System.out.println("Second largest value using Arrays: "+ secondLargestusingArrays);
    }
}
