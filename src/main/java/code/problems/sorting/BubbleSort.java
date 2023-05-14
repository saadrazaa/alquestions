package code.problems.sorting;

import java.util.List;

public class BubbleSort {

    public static void sort(List<Integer> nums, boolean reverse){
        boolean swapped = false;

        for (int i=0; i < nums.size(); i++){

            for (int j = 0; j < nums.size() - i - 1; j++){

                if (reverse) {
                    if(nums.get(j) < nums.get(j+1)){
                        int temp = nums.get(j);
                        nums.set(j, nums.get(j+1));
                        nums.set(j + 1, temp);
                        swapped = true;
                    }
                }
                else {
                    if(nums.get(j) > nums.get(j+1)){
                        int temp = nums.get(j);
                        nums.set(j, nums.get(j+1));
                        nums.set(j + 1, temp);
                        swapped = true;
                    }
                }

            }

            if(!swapped){
                break;
            }
        }
    }

    public static void sort(List<Integer> nums){
        sort(nums, false);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
