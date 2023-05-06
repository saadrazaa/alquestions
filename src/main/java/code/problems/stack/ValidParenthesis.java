package code.problems.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Problem:
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class ValidParenthesis {

    public static boolean isValid(String s){

        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');

        Stack<Character> container = new Stack<>();

        for(Character c: s.toCharArray()){

            if(bracketsMap.containsKey(c)){
                container.add(c);
            }

            else if (container.size() == 0 || bracketsMap.get(container.pop()) != c){
                return false;
            }
        }

        return container.size() == 0;
    }
}
