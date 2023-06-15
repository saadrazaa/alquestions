package code.problems.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
Problem:
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

Constraints:
The number of nodes in the tree is in the range [0, 104].
-1000 <= Node.val <= 1000
 */
public class SerializeAndDeserializeBinaryTree {

    static int index;
    static List<String> values;
    public static String serialize(BinaryTreeNode root){
        List<String> values = new ArrayList<>();
        _serializeDFS(root, values);
        return toString(values);
    }

    private static void _serializeDFS(BinaryTreeNode root, List<String> values){
        if(root == null){
            values.add("N");
            return;
        }

        values.add(String.valueOf(root.value));
        _serializeDFS(root.left, values);
        _serializeDFS(root.right, values);
    }

    public static BinaryTreeNode deserialize(String vals){
        index = 0;
        values = fromString(vals);
        return _deserializeDFS();
    }

    private static BinaryTreeNode _deserializeDFS(){
        if(Objects.equals(values.get(index), "N")){
            index += 1;
            return null;
        }

        BinaryTreeNode node = new BinaryTreeNode(Integer.parseInt(values.get(index)));
        index += 1;
        node.left = _deserializeDFS();
        node.right = _deserializeDFS();
        return node;
    }

    private static String toString(List<String> values){
        StringBuilder res = new StringBuilder();
        for(String s : values){
            res.append(s).append(", ");
        }
        return res.substring(0, res.length()-2);
    }

    private static List<String> fromString(String values){
        return Arrays.stream(values.split(", ")).toList();
    }
}
