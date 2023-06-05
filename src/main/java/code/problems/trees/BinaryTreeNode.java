package code.problems.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static BinaryTreeNode constructBinaryTree(List<Integer> values) {
        if (values == null || values.isEmpty())
            return null;

        BinaryTreeNode root = new BinaryTreeNode(values.get(0));
        int size = values.size();
        int index = 1;

        List<BinaryTreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (index < size) {
            BinaryTreeNode currNode = queue.get(0);
            queue.remove(0);

            int val = values.get(index++);
            currNode.left = new BinaryTreeNode(val);
            queue.add(currNode.left);

            if (index >= size)
                break;

            val = values.get(index++);
            currNode.right = new BinaryTreeNode(val);
            queue.add(currNode.right);

        }

        return root;
    }

    public static List<Integer> toArrayList(BinaryTreeNode root){
        List<Integer> values = new ArrayList<>();

        if(root == null){
            return values;
        }

        Queue<BinaryTreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            BinaryTreeNode node = nodes.remove();
            values.add(node.value);

            if(node.left != null){
                nodes.add(node.left);
            }

            if(node.right != null){
                nodes.add(node.right);
            }

        }

        return values;
    }

     static void _toPrefix(BinaryTreeNode root, List<Integer> values){
        if(root == null){
            return;
        }

        values.add(root.value);
        _toPrefix(root.left, values);
        _toPrefix(root.right, values);
    }

    public static List<Integer> toPrefix(BinaryTreeNode root){
        List<Integer> values = new ArrayList<>();
        _toPrefix(root, values);
        return values;
    }

    static void _toPostfix(BinaryTreeNode root, List<Integer> values){
        if(root == null){
            return;
        }

        _toPostfix(root.left, values);
        _toPostfix(root.right, values);
        values.add(root.value);

    }

    public static List<Integer> toPostfix(BinaryTreeNode root){
        List<Integer> values = new ArrayList<>();
        _toPostfix(root, values);
        return values;
    }

    static void _toInfix(BinaryTreeNode root, List<Integer> values){
        if(root == null){
            return;
        }

        _toInfix(root.left, values);
        values.add(root.value);
        _toInfix(root.right, values);

    }

    public static List<Integer> toInfix(BinaryTreeNode root){
        List<Integer> values = new ArrayList<>();
        _toInfix(root, values);
        return values;
    }

}
