package code.problems.trees;

/*
Problem:
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Constraints:
The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
 */
public class ValidBinarySearchTree {

    public static boolean check(BinaryTreeNode root){
        return _validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean _validate(BinaryTreeNode node, int left, int right){
        if(node == null){
            return true;
        }

        if(! (node.value > left && node.value < right)){
            return false;
        }

        return _validate(node.left, left, node.value) && _validate(node.right, node.value, right);
    }
}
