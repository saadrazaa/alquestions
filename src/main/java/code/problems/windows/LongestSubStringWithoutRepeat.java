package code.problems.windows;

import java.util.HashSet;
import java.util.Set;

/*
Problem:
Given a string s, find the length of the longest
substring
 without repeating characters.

Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubStringWithoutRepeat {

    public static int find(String s){

        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int right = 0;

        int maxLength = 0;

        while (right < s.length()){

            while (charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left += 1;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
            right += 1;
        }

        return maxLength;
    }
}
