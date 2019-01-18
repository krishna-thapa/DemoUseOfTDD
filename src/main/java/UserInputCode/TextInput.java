package UserInputCode;

import java.util.ArrayList;
import java.util.List;

public class TextInput {

    public static List<Character> list = new ArrayList<Character>();

    public void add(char c) {
        list.add(c);
    }

    public String getValue() {
        String result = "";
        for(char c : list){
             result += c;
        }
        return result;
    }
}
