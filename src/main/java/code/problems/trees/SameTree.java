package code.problems.trees;

/*
Problem:
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Constraints:
The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */
public class SameTree {

    public static boolean check(BinaryTreeNode p, BinaryTreeNode q){

        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null || p.value != q.value){
            return false;
        }

        return check(p.left, q.left) && check(p.right, q.right);
    }
}
