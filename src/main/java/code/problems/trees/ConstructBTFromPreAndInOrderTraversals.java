package code.problems.trees;

import java.util.List;

/*
Problem:
Given two integer arrays preorder and inorder where preorder is the
preorder traversal of a binary tree and inorder is the inorder traversal of the same tree,
construct and return the binary tree.

Constraints:
1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.
 */
public class ConstructBTFromPreAndInOrderTraversals {

    public static BinaryTreeNode build(List<Integer> preOrder, List<Integer> inOrder){
        if(preOrder.size() == 0 || inOrder.size() == 0){
            return null;
        }

        BinaryTreeNode root = new BinaryTreeNode(preOrder.get(0));
        int mid = inOrder.indexOf(preOrder.get(0));

        root.left = build(preOrder.subList(1, mid+1), inOrder.subList(0, mid));
        root.right = build(preOrder.subList(mid+1, preOrder.size()), inOrder.subList(mid+1, inOrder.size()));

        return root;
    }
}
