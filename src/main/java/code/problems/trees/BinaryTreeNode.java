package code.problems.trees;

import java.util.*;

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

            Integer val = values.get(index++);
            if(val != null){
                currNode.left = new BinaryTreeNode(val);
                queue.add(currNode.left);
            }

            if (index >= size)
                break;

            val = values.get(index++);
            if(val != null) {
                currNode.right = new BinaryTreeNode(val);
                queue.add(currNode.right);
            }

        }

        return root;
    }

    public static BinaryTreeNode constructBinarySearchTree(List<Integer> nums){
        if(nums == null || nums.size() == 0){
            return null;
        }

        nums = nums.stream().filter(Objects::nonNull).toList();
        nums = new ArrayList<>(nums);
        Collections.sort(nums);

        return BinaryTreeNode._buildBST(nums, 0, nums.size()-1);
    }

    static BinaryTreeNode _buildBST(List<Integer> nums, int left, int right){
        if(left > right){
            return null;
        }

        int mid = Math.floorDiv((left + right), 2);
        BinaryTreeNode root = new BinaryTreeNode(nums.get(mid));

        root.left = _buildBST(nums, left, mid - 1);
        root.right = _buildBST(nums, mid + 1, right);

        return root;
    }

    public static List<Integer> toArrayListWithNulls(BinaryTreeNode root){
        List<Integer> values = new ArrayList<>();

        if(root == null){
            return values;
        }

        List<BinaryTreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            BinaryTreeNode node = nodes.get(0);
            nodes.remove(0);

            if(node != null){
                values.add(node.value);
                nodes.add(node.left);
                nodes.add(node.right);
            }
            else{
                values.add(-1);
            }

        }

        return values;
    }

    public static List<Integer> toArrayList(BinaryTreeNode root){
        List<Integer> values = new ArrayList<>();

        if(root == null){
            return values;
        }

        List<BinaryTreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            BinaryTreeNode node = nodes.get(0);
            nodes.remove(0);

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
