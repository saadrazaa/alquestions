package code.problems.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSubsequence {

    /**
     * @param var an integer array [], containing un-sorted and shuffled numbers. duplicates are allowed.
     * @return length of the longest consecutive subsequence (LCS)
     * @throws Exception
     */
    public static int function(int[] var) throws Exception {

        if (!(var.length > 0)){
            throw new Exception("Empty Array");
        }

        int maxSequence = 0;
        int count = 0;

        Arrays.sort(var);

        List<Integer> v = new ArrayList<>();
        v.add(var[0]);

        for (int i = 1 ; i < var.length; i++){
            if (var[i] != var[i-1]){
                v.add(var[i]);
            }
        }

        for (int i = 0; i < v.size(); i++){

            if (i > 0 && v.get(i) == v.get(i-1) + 1){
                count += 1;
            }
            else{
                count = 1;
            }

            maxSequence = Integer.max(maxSequence, count);
        }

        return maxSequence;
    }
}
