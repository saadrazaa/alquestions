package code.problems.trees;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserializeBinaryTree {

    public static String serialize(BinaryTreeNode root){
        List<String> values = new ArrayList<>();
        _serializeDFS(root, values);
        return values.toString();
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
}
