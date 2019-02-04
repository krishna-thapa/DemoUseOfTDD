package RotateArray;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotateArrayRight(nums, k);


    }

    private static void rotateArrayRight(int[] nums, int k) {

        //Rotate the array in right order by k
        //Output will be : [5,6,7,1,2,3,4]
        int l = nums.length;
        int[] temp = new int[l];

        for(int i =0; i < k; i++){
            temp[i] = nums[l-k+i];
        }
        System.out.println(Arrays.toString(temp));  //[5, 6, 7, 0, 0, 0, 0]
        int start = 0;
        for(int i = k; i < l; i++){
            temp[i] = nums[start++];
        }
        System.out.println(Arrays.toString(temp));  //[5, 6, 7, 1, 2, 3, 4]
        System.arraycopy(temp,0,nums,0,l);
        System.out.println(Arrays.toString(nums));  //[5, 6, 7, 1, 2, 3, 4]
    }
}
