package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IsSubTreeTest {

    List<Integer> t1;

    @BeforeEach
    void setup(){
        t1 = new ArrayList<>(List.of(3,4,5,1,2));
        t1.add(null);t1.add(null);t1.add(null);t1.add(null);
        t1.add(0);
    }

    @Test
    void test(){
        assertAll(()->{
            assertTrue(IsSubTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(3,4,5,1,2)),
                    BinaryTreeNode.constructBinaryTree(List.of(4,1,2))
            ));
            assertFalse(IsSubTree.check(
                    BinaryTreeNode.constructBinaryTree(t1),
                    BinaryTreeNode.constructBinaryTree(List.of(4,1,2))
            ));
            assertTrue(IsSubTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of()),
                    BinaryTreeNode.constructBinaryTree(List.of())
            ));
            assertTrue(IsSubTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(1)),
                    BinaryTreeNode.constructBinaryTree(List.of())
            ));
            assertFalse(IsSubTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of()),
                    BinaryTreeNode.constructBinaryTree(List.of(1,2))
            ));
        });
    }

}