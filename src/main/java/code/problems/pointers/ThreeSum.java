package code.problems.pointers;

import java.util.*;

/*
Problem:
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */
public class ThreeSum {

    public static List<List<Integer>> find(List<Integer> nums){
        nums.sort(Comparator.naturalOrder());

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i < nums.size(); i++){
            if ( i>0 && nums.get(i) == nums.get(i-1)){
                continue;
            }

            int start = i + 1;
            int end = nums.size() - 1;
            int target = -nums.get(i);

            while (start < end){
                if ((nums.get(start) + nums.get(end)) == target){
                    result.add(new ArrayList<>(List.of(nums.get(i), nums.get(start), nums.get(end))));
                    start += 1;
                    while (start < end && nums.get(start) == nums.get(start - 1)){
                        start += 1;
                    }
                }
                else if ((nums.get(start) + nums.get(end)) < target){
                    start += 1;
                }
                else if ((nums.get(start) + nums.get(end)) > target){
                    end -= 1;
                }
            }
        }

        return result;
    }
}
