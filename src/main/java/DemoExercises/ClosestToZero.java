package DemoExercises;

import java.util.ArrayList;
import java.util.List;

public class ClosestToZero {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("4");
        list.add("-2");
       // list.add("-1");

        int closestInt = Integer.parseInt(list.get(0));
        for(String s : list){
            int currentInt = Integer.parseInt(s);
            if(Math.abs(currentInt) == Math.abs(closestInt)){
                closestInt = Math.abs(currentInt);
            }
            if(Math.abs(currentInt) < Math.abs(closestInt)){
                closestInt = currentInt;
            }
        }
        System.out.println("Closet to 0 is number: "+closestInt);
    }
}
