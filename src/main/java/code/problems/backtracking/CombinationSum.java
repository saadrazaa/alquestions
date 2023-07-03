package code.problems.backtracking;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Problem:
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Constraints:
1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40
 */
public class CombinationSum {

    static private List<List<Integer>> RESULT;
    static private List<Integer> CANDIDATES;
    static private int TARGET;
    public static List<List<Integer>> find(List<Integer> candidates, int target){

        RESULT = new ArrayList<>();
        CANDIDATES = candidates;
        TARGET = target;

        dfs_decision(0, new Stack<>(), 0);
        return RESULT;
    }

    private static void dfs_decision(int index, Stack<Integer> current, int sum){
        if(sum == TARGET){
            RESULT.add(List.copyOf(current));
            return;
        }
        if(index >= CANDIDATES.size() || sum > TARGET){
            return;
        }

        // explore combinations from the current number
        current.add(CANDIDATES.get(index));
        dfs_decision(index, current, sum + CANDIDATES.get(index));

        // explore combination without the current number, to avoid duplications
        current.pop();
        dfs_decision(index+1, current, sum);
    }
}
