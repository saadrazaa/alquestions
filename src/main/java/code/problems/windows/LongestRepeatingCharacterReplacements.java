package code.problems.windows;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
Problem:
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

Constraints:
1 <= s.length <= 105
s consists of only uppercase English letters.
0 <= k <= s.length
 */
public class LongestRepeatingCharacterReplacements {

    public static int find(String s, Integer k){

        Map<Character, Integer> charCounts = new HashMap<>();
        int left = 0;
        int right = 0;

        int maxLength = 0;

        while (right < s.length()){

            charCounts.put(s.charAt(right), 1 + charCounts.getOrDefault(s.charAt(right), 0));

            int maxF = charCounts.values().stream().max(Comparator.naturalOrder()).get();

            if( (s.substring(left, right + 1).length() - maxF) <= k ){
                maxLength = Math.max(maxLength, s.substring(left, right + 1).length());
            }
            else{
                charCounts.put(s.charAt(left), charCounts.get(s.charAt(left)) - 1);
                left += 1;
            }

            right += 1;

        }

        return maxLength;
    }
}
