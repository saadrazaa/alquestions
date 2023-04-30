package code.problems.pointers;

import java.util.List;

/*
Problem:
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */
public class ContainerWithMostWater {

    public static int findMaxArea(List<Integer> heights){

        int maxA = -1;
        int start = 0;
        int end = heights.size() - 1;

        while (start < end){
            maxA = Math.max((Math.min(heights.get(start), heights.get(end))) * (end - start), maxA);

            if (heights.get(start) < heights.get(end)){
                start += 1;
            }
            else{
                end -= 1;
            }
        }

        return maxA;
    }
}
