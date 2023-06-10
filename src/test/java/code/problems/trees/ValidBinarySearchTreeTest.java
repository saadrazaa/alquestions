package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidBinarySearchTreeTest {

    List<Integer> l1;
    List<Integer> l2;

    @BeforeEach
    void setup(){
        l1 = new ArrayList<>(List.of(5,4,6));
        l1.add(null);l1.add(null);l1.add(3);l1.add(7);

        l2 = new ArrayList<>(List.of(5,1,4));
        l2.add(null);l2.add(null);l2.add(3);l2.add(6);
    }

    @Test
    void test(){
        assertAll(()->{
            assertFalse(ValidBinarySearchTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(2,2,2))
            ));
            assertTrue(ValidBinarySearchTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(2,1,3))
            ));
            assertTrue(ValidBinarySearchTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(2))
            ));
            assertFalse(ValidBinarySearchTree.check(
                    BinaryTreeNode.constructBinaryTree(l1)
            ));
            assertFalse(ValidBinarySearchTree.check(
                    BinaryTreeNode.constructBinaryTree(l2)
            ));
        });
    }

}