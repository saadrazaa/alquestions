package code.problems.arrays;

import java.util.HashSet;

/*
Problem:
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Constraints:
1 <= arr.length <= 105
-109 <= arr[i] <= 109
*/
public class ContainsDuplicate {

    public static boolean check(int[] arr){
        HashSet<Integer> distinct = new HashSet<Integer>();
        for(int i : arr){
            if (distinct.contains(i)){
                return true;
            }
            else{
                distinct.add(i);
            }
        }
        return false;
    }
}
