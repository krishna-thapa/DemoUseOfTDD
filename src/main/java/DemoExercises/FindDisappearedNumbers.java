package DemoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args){
        int[] input = {1, 2, 2, 3, 3, 4, 7, 8};
        soltion(input);
    }

    private static void soltion(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        List<Integer> temp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int start = 0;
        for(int i =1; i < nums.length; i++){
            if(nums[start] != nums[i]){
                temp.add(nums[start]);
            }
            start++;
        }
        temp.add(nums[nums.length-1]);
        int n = 1;
        for(int i =0; i < temp.size(); i++){
            if(temp.get(i) != n) {
                result.add(n);
            }
            n++;
        }
        System.out.println("Output: "+Arrays.toString(result.toArray()));
    }
}
