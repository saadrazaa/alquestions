package code.problems.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Problem:
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
public class LargestConsecutiveSequence {

    public static int find(List<Integer> nums){
        Set<Integer> numSet = new HashSet<>(nums);

        int maxL = 0;
        for(int n : nums){
            if(!numSet.contains(n-1)){
                int length = 1;
                while (numSet.contains(n + length)){
                    length += 1;
                }
                maxL = Math.max(length, maxL);
            }
        }

        return maxL;
    }
}
