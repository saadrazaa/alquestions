package code.problems.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class BracketSequence {

    /**
     * @param var a string to check for correct bracket sequence. empty strings or strings with no brackets return True.
     * @return True or False
     */
    public static boolean function(String var){

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : var.toCharArray()){

            if (map.containsValue(c)){
                stack.push(c);
            }

            if ( map.containsKey(c)){
                if ( !stack.empty() && stack.peek() == map.get(c)) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
