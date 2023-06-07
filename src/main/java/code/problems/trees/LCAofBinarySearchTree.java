package code.problems.trees;

/*
Problem:
Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Constraints:
The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the BST.
 */
public class LCAofBinarySearchTree {

    public static Integer find(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q){

        BinaryTreeNode current = root;

        while(current != null){

            if(p.value < current.value && q.value < current.value){
                current = current.left;
            }
            else if(p.value > current.value && q.value > current.value){
                current = current.right;
            }
            else{
                return current.value;
            }
        }

        return null;
    }
}
