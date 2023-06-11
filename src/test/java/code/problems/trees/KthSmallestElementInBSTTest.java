package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInBSTTest {

    List<Integer> l1;
    List<Integer> l2;
    List<Integer> l3;
    List<Integer> l4;

    @BeforeEach
    void setup(){
        l1 = new ArrayList<>(List.of(5,3,6,1,4));
        l1.add(null);l1.add(null);l1.add(null);l1.add(2);

        l2 = new ArrayList<>(List.of(5,3,6,1,4));
        l2.add(null);l2.add(null);l2.add(null);l2.add(null);

        l3 = new ArrayList<>(List.of(5,3,6,2,4));
        l3.add(null);l3.add(null);l3.add(1);

        l4 = new ArrayList<>(List.of(3,1,4));
        l4.add(null);l4.add(2);
    }

    @Test
    void testIterative(){
        assertAll(()->{
            assertEquals(2, KthSmallestElementInBST.getIterative(
                    BinaryTreeNode.constructBinaryTree(l1), 2
            ));
            assertEquals(1, KthSmallestElementInBST.getIterative(
                    BinaryTreeNode.constructBinaryTree(l2), 1
            ));
            assertEquals(3, KthSmallestElementInBST.getIterative(
                    BinaryTreeNode.constructBinaryTree(l3), 3
            ));
            assertEquals(1, KthSmallestElementInBST.getIterative(
                    BinaryTreeNode.constructBinaryTree(l4), 1
            ));
        });
    }

    @Test
    void testRecursive(){
        assertAll(()->{
            assertEquals(2, KthSmallestElementInBST.getRecursive(
                    BinaryTreeNode.constructBinaryTree(l1), 2
            ));
            assertEquals(1, KthSmallestElementInBST.getRecursive(
                    BinaryTreeNode.constructBinaryTree(l2), 1
            ));
            assertEquals(3, KthSmallestElementInBST.getRecursive(
                    BinaryTreeNode.constructBinaryTree(l3), 3
            ));
            assertEquals(1, KthSmallestElementInBST.getRecursive(
                    BinaryTreeNode.constructBinaryTree(l4), 1
            ));
        });
    }

}