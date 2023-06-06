package code.problems.trees;

/*
Problem:
Given the root of a binary tree, invert the tree, and return its root.

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */
public class InvertBinaryTree {

    public static BinaryTreeNode invert(BinaryTreeNode root){
        if(root == null){
            return null;
        }

        BinaryTreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invert(root.left);
        invert(root.right);

        return root;
    }
}
