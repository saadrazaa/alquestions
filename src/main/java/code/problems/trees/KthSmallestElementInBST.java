package code.problems.trees;

import java.util.Stack;

/*
Problem:
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

Constraints:
The number of nodes in the tree is n.
1 <= k <= n <= 104
0 <= Node.val <= 104
 */
public class KthSmallestElementInBST {

    public static int getIterative(BinaryTreeNode root, int k){
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode curr = root;

        while(curr != null || !stack.isEmpty()){

            while(curr !=null){
                stack.add(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            k -= 1;
            if (k == 0){
                return curr.value;
            }

            curr = curr.right;
        }

        return -1;
    }
}
