package code.problems.arrays;

import java.util.*;

/*
Problem:
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */
public class GroupAnagrams {

    public static List<List<String>> group(String[] strs){
        HashMap<String, List<String>> mapSortedToStrings = new HashMap<>();

        for (String s : strs) {

            String key = sortString(s);
            if(!mapSortedToStrings.containsKey(key)){
                mapSortedToStrings.put(key, new ArrayList<>());
            }
            List<String> arr = mapSortedToStrings.get(key);
            arr.add(s);
        }
        return new ArrayList<>(mapSortedToStrings.values());
    }

    static String sortString(String str){
        char[] characters = str.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}
