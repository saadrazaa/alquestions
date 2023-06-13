package code.problems.trees;

import java.util.ArrayList;
import java.util.List;

/*
Problem:
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.

Constraints:
The number of nodes in the tree is in the range [1, 3 * 104].
-1000 <= Node.val <= 1000
 */
public class BinaryTreeMaximumPathSum {

    static int maxSumWithoutSplit;
    public static int find(BinaryTreeNode root){
        maxSumWithoutSplit = Integer.MIN_VALUE;
        _dfs(root);
        return maxSumWithoutSplit;
    }

    static int _dfs(BinaryTreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = Math.max(_dfs(root.left), 0);
        int rightSum = Math.max(_dfs(root.right), 0);

        maxSumWithoutSplit = Math.max(maxSumWithoutSplit, root.value + leftSum + rightSum);

        return root.value + Math.max(leftSum, rightSum);

    }
}
