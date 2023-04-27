package code.problems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Problem:
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 */
public class TopKFrequentElements {

    public static List<Integer> find(int[] nums, int k){
        Map<Integer, Integer> counts = new HashMap<>();
        List<List<Integer>> freq = new ArrayList<>();

        for(int i=0; i < nums.length + 1; i++){
            freq.add(new ArrayList<>());
        }

        for (int n : nums){
            int currentCount = counts.getOrDefault(n, 0);
            counts.put(n, currentCount + 1);
        }

        counts.forEach((num, count) -> freq.get(count).add(num));

        List<Integer> result = new ArrayList<>();
        for(int index = freq.size()-1; index > 0; index--){
            for(int num : freq.get(index)){
                result.add(num);
                if (result.size() == k) {
                    return result;
                }
            }
        }

        return new ArrayList<Integer>();
    }
}
