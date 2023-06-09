package code.problems.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    void testRecursive(){
        assertAll(()->{
            assertEquals(List.of(List.of(1)), BinaryTreeLevelOrderTraversal.traverseRecursive(
                    BinaryTreeNode.constructBinaryTree(List.of(1))
            ));
            assertEquals(List.of(), BinaryTreeLevelOrderTraversal.traverseRecursive(
                    BinaryTreeNode.constructBinaryTree(List.of())
            ));
        });
    }
}