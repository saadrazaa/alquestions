package code.problems.trees;

/*
Problem:
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

Constraints:
The number of nodes in the root tree is in the range [1, 2000].
The number of nodes in the subRoot tree is in the range [1, 1000].
-104 <= root.val <= 104
-104 <= subRoot.val <= 104
 */
public class IsSubTree {

    public static boolean check(BinaryTreeNode root, BinaryTreeNode subRoot){

        if(subRoot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(SameTree.check(root, subRoot)){
            return true;
        }

        return check(root.left, subRoot) || check(root.right, subRoot);
    }
}
