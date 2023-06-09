package code.problems.trees;

import java.util.ArrayList;
import java.util.List;

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

    public static List<List<Integer>> traverseIterative(){
        return List.of();
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
