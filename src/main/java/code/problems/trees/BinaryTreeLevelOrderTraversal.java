package code.problems.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
Problem:
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

Constraints:
The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
 */
public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> traverseRecursive(BinaryTreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        _preOrder(root, result, 0);
        return result;
    }

    public static List<List<Integer>> traverseIterative(BinaryTreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        Queue<BinaryTreeNode> q = new ArrayDeque<>();
        if(root !=null) q.add(root);

        while(!q.isEmpty()){
            int qLen = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < qLen; i++){
                BinaryTreeNode node = q.remove();

                level.add(node.value);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            if(!level.isEmpty()){
                result.add(level);
            }
        }

        return result;
    }

    public static void _preOrder(BinaryTreeNode root, List<List<Integer>> arr, int level){
        if(root == null){
            return;
        }

        if(level >= arr.size()){
            arr.add(new ArrayList<>());
        }
        arr.get(level).add(root.value);
        _preOrder(root.left, arr, level + 1);
        _preOrder(root.right, arr, level + 1);

    }
}
