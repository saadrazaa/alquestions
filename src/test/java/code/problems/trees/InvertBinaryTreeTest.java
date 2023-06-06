package code.problems.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    @Test
    void test(){
        assertAll(()->{
            assertEquals(List.of(4,7,2,9,6,3,1), BinaryTreeNode.toArrayList(
                    InvertBinaryTree.invert(BinaryTreeNode.constructBinaryTree(
                            List.of(4,2,7,1,3,6,9)
                    ))
            ));
            assertEquals(List.of(2,3,1), BinaryTreeNode.toArrayList(
                    InvertBinaryTree.invert(BinaryTreeNode.constructBinaryTree(
                            List.of(2,1,3)
                    ))
            ));
            assertEquals(List.of(), BinaryTreeNode.toArrayList(
                    InvertBinaryTree.invert(BinaryTreeNode.constructBinaryTree(
                            List.of()
                    ))
            ));
        });
    }
}