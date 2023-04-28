package code.problems.arrays;

import java.util.ArrayList;
import java.util.List;

/*
Problem:
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
Can you solve the problem in O(1) extra space complexity? (The output array does not count as
extra space for space complexity analysis.)

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class ProductOfArrayExceptSelf {

    public static List<Integer> compute(List<Integer> nums){
        List<Integer> result = new ArrayList<>();
        for(int n: nums){
            result.add(1);
        }

        int prefix = 1;
        for(int i=0; i < nums.size(); i++){
            result.set(i, prefix);
            prefix *= nums.get(i);
        }

        int postfix = 1;
        for(int i=nums.size()-1; i > -1; i--){
            result.set(i, result.get(i) * postfix);
            postfix *= nums.get(i);
        }

        return result;
    }
}
