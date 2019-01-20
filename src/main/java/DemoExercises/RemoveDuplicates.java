package DemoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {10,20,20,10,10,30,50,10,20};

        /**
         * To find the total number of pairs in any given integer array
         */
        Set<Integer> setInt = new HashSet<>();
        int resultPair = 0;
        for(int i=0; i <nums.length; i++){
            if(setInt.contains(nums[i])){
                resultPair++;
                setInt.remove(nums[i]);
            }else{
                setInt.add(nums[i]);
            }
        }

        System.out.println("No of pair numbers: "+ resultPair);

        ArrayList<Integer> arrayChar = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println("Sorted array: "+ Arrays.toString(nums));
        int j = 0, result= 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[j] != nums[i]){
                arrayChar.add(nums[j]);
                result++;
            }
            j++;
        }
        arrayChar.add(nums[nums.length-1]);
        System.out.println("No of distinct numbers: "+ (result+1));
        System.out.println("Array of distinct numbers: "+ Arrays.toString(arrayChar.toArray()));

    }
}
