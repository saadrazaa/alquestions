package code.problems.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeMaximumPathSum {

    public static int find(BinaryTreeNode root){
        List<Integer> result = _dfs(root);
        return Math.max(result.get(0), result.get(1));
    }

    static List<Integer> _dfs(BinaryTreeNode root){
        if(root == null){
            return new ArrayList<>(List.of(0,0));
        }

        List<Integer> sumsLeft = _dfs(root.left);
        List<Integer> sumsRight = _dfs(root.right);

        int leftSum = sumsLeft.get(0);
        int rightSum = sumsRight.get(0);
        int maxWithoutSplitSum = Math.max(sumsLeft.get(1), sumsRight.get(1));

        leftSum = Math.max(leftSum, 0);
        rightSum = Math.max(rightSum, 0);

        return new ArrayList<>(
                List.of(root.value + Math.max(leftSum, rightSum),
                        Math.max(root.value + leftSum + rightSum, maxWithoutSplitSum)
                ));

    }
}
