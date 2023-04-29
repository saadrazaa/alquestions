package code.problems.arrays;

import java.util.ArrayList;
import java.util.List;

/*
Problem:
Given a list of strings, encode them into a single string. The encoded string should be constructed in a such a way
that it is possible to decode the original list of strings from  the encoded string

Implement two functions; encode & decode
 */
public class EncodeOrDecode {

    static final char delimiter = '%';

    public static String encode(List<String> strs){

        StringBuilder result = new StringBuilder();

        for (String s : strs){
            result.append(s.length());
            result.append(delimiter);
            result.append(s);
        }

        return result.toString();
    }

    public static List<String> decode(String str){
        List<String> result = new ArrayList<>();
        int pointer = 0;

        while (pointer < str.length()){
            int subPointer = pointer;
            while (str.charAt(subPointer) != delimiter){
                subPointer += 1;
            }
            int lengthOfWord = Integer.parseInt(str.substring(pointer, subPointer));

            result.add(str.substring(subPointer + 1, subPointer + 1 + lengthOfWord));

            pointer += subPointer + 1 + lengthOfWord;
        }

        return result;
    }
}
