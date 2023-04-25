package code.problems.arrays;

import java.util.HashMap;
import java.util.Objects;

/*
Problem:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the
letters of a different word or phrase, typically using all the original letters exactly once.

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
public class ValidAnagram {

    public static boolean check(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        }

        for(char c : mapS.keySet()){
            if(!Objects.equals(mapT.get(c), mapS.get(c))){
                return false;
            }
        }
        return true;
    }
}
