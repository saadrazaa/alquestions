package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LCAofBinarySearchTreeTest {

    List<Integer> l1;

    @BeforeEach
    void setup(){
        l1 = new ArrayList<>(List.of(6,2,8,0,4,7,9));
        l1.add(null);l1.add(null); l1.add(3); l1.add(5);
    }

    @Test
    void test(){
        assertAll(()->{
            assertEquals(6, LCAofBinarySearchTree.find(
                    BinaryTreeNode.constructBinaryTree(l1),
                    new BinaryTreeNode(2),
                    new BinaryTreeNode(8)
            ));
            assertEquals(2, LCAofBinarySearchTree.find(
                    BinaryTreeNode.constructBinaryTree(l1),
                    new BinaryTreeNode(2),
                    new BinaryTreeNode(4)
            ));
            assertEquals(2, LCAofBinarySearchTree.find(
                    BinaryTreeNode.constructBinaryTree(List.of(2,1)),
                    new BinaryTreeNode(2),
                    new BinaryTreeNode(1)
            ));
        });
    }

}