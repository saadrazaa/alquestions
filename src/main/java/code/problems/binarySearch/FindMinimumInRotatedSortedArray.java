package code.problems.binarySearch;

import java.util.List;

/*
Problem:
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Constraints:
n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
All the integers of nums are unique.
nums is sorted and rotated between 1 and n times.
 */
public class FindMinimumInRotatedSortedArray {

    public static int find(List<Integer> nums){
        int min = nums.get(0);

        int left = 0;
        int right = nums.size() - 1;

        while (left <= right){

            if (nums.get(left) < nums.get(right)){
                min = Math.min(nums.get(left), min);
                break;
            }

            int mid = Math.floorDiv((left + right), 2);
            min = Math.min(min, nums.get(mid));

            if (nums.get(mid) >= nums.get(left)){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return min;

    }
}
