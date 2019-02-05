package DemoExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreatestNumber {
    /**
     * Find the maximum number that a non-negative number can have in any order rage
     * For example: 123, output is 321
     * for example 2563, output is 6532
     */

    public static void main(String[] args){
        int input = 2031;
        int result = 0;
        List<Integer> list = new ArrayList<>();
        while(input != 0){
            list.add(input%10);
            input = input/10;
        }
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
        for(int i = list.size()-1; i >= 0; i --){
            result = result*10 + list.get(i);
        }
        System.out.println("Greatest number is: " + result);
    }
}
