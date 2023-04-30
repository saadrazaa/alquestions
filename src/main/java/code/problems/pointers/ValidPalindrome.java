package code.problems.pointers;

import java.util.regex.Pattern;

/*
Problem:
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class ValidPalindrome {

    public static boolean check(String str){
        str = str.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start += 1;
            end -= 1;
        }

        return true;

    }
}
