package code.problems.windows;

import java.lang.reflect.Array;
import java.util.*;

public class MinimumWindowSubstring {

    public static String find(String s, String t){

        if (s.length() < t.length()){
            return "";
        }

        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> mapW = new HashMap<>();

        for(char c : t.toCharArray()){
            mapT.put(c, 1+mapT.getOrDefault(c, 0));
        }

        int[] result = new int[2];
        int minLength = Integer.MAX_VALUE;

        int have = 0;
        int need = mapT.size();

        int left = 0;

        for(int right = 0; right < s.length(); right++){

            char c = s.charAt(right);
            mapW.put(c, 1 + mapW.getOrDefault(c, 0));

            if (mapT.containsKey(c) && mapW.get(c) == mapT.get(c)){
                have += 1;
            }

            while (have == need){
                int length = right - left + 1;

                if(length < minLength){
                    minLength = length;
                    result[0] = left;
                    result[1] = right;
                }

                mapW.put(s.charAt(left), mapW.get(s.charAt(left)) - 1);

                if( mapT.containsKey(s.charAt(left)) && mapW.get(s.charAt(left)) < mapT.get(s.charAt(left))){
                    have -= 1;
                }

                left += 1;
            }
        }

        return minLength != Integer.MAX_VALUE ? s.substring(result[0], result[1] + 1) : "";
    }
}
