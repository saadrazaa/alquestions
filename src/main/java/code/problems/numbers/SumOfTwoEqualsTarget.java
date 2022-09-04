package code.problems.numbers;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoEqualsTarget {

    /**
     * @param nums array of numbers, from which to find index of two numbers that equal target
     * @param target
     * @return an array of len 2, containing indexes of numbers found. empty otherwise.
     */
    public static long[] find(long[] nums, long target){

        // dynamic programming map, to store numbers with their indexes
        // such an approach brings our time complexity to O(n)
        Map<Long, Long> dpMap = new HashMap<>();

        // loop for finding complements
        for (long i = 0; i < nums.length ; i++){

            long current = target - nums[(int) i];

            if (dpMap.containsKey(current)){
                return new long[] { dpMap.get(current), i};
            }else{
                dpMap.put(nums[(int) i], i);
            }
        }

        return new long[] {};
    }
}
