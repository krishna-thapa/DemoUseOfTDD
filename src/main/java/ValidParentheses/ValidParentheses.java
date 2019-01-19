package ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean validParenthesesCode(String input) throws EmptyParenthesesInput{

        if(input.isEmpty()) throw new EmptyParenthesesInput("Empty Parentheses input!");
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(int i =0; i < input.length(); i++){
            if(map.containsKey(input.charAt(i))){
                stack.push(input.charAt(i));
            }else{
                if(!stack.empty() && map.get(stack.peek()) == input.charAt(i)){
                    stack.pop();
                }else return false;
            }
        }

        return stack.empty();
    }
}
