package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBinaryTreeTest {

    List<Integer> l1;

    @BeforeEach
    void setup(){
        l1 = new ArrayList<>(List.of(1,2,3));
        l1.add(null);l1.add(null); l1.add(4); l1.add(5);
    }

    @Test
    void test(){
        assertAll(()->{
            assertEquals(BinaryTreeNode.toArrayList(BinaryTreeNode.constructBinaryTree(l1)),
                    BinaryTreeNode.toArrayList(
                            SerializeAndDeserializeBinaryTree.deserialize(
                            SerializeAndDeserializeBinaryTree.serialize(
                                            BinaryTreeNode.constructBinaryTree(l1)
                                    )
                            )
                    ));
            assertEquals(BinaryTreeNode.toArrayList(BinaryTreeNode.constructBinaryTree(List.of())),
                    BinaryTreeNode.toArrayList(
                            SerializeAndDeserializeBinaryTree.deserialize(
                                    SerializeAndDeserializeBinaryTree.serialize(
                                            BinaryTreeNode.constructBinaryTree(List.of())
                                    )
                            )
                    ));
        });
    }

}