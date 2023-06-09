package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    List<Integer> l1;

    @BeforeEach
    void setup(){
        l1 = new ArrayList<>(List.of(3,9,20));
        l1.add(null);l1.add(null);l1.add(15);l1.add(7);

    }
    @Test
    void testRecursive(){
        assertAll(()->{
            assertEquals(List.of(List.of(3),List.of(9,20),List.of(15,7)),
                    BinaryTreeLevelOrderTraversal.traverseRecursive(
                        BinaryTreeNode.constructBinaryTree(l1)
            ));
            assertEquals(List.of(List.of(1)), BinaryTreeLevelOrderTraversal.traverseRecursive(
                    BinaryTreeNode.constructBinaryTree(List.of(1))
            ));
            assertEquals(List.of(), BinaryTreeLevelOrderTraversal.traverseRecursive(
                    BinaryTreeNode.constructBinaryTree(List.of())
            ));
        });
    }
}