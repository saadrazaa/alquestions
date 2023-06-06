package code.problems.trees;

/*
Problem:
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Constraints:
The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
 */
public class MaxDepthOfBinaryTree {

    public static int find(BinaryTreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(
                find(root.left),
                find(root.right)
        );
    }
}
