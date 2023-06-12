package code.problems.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {

    @Test
    void test(){
        assertAll(()->{
            assertEquals(6, BinaryTreeMaximumPathSum.find(
                    BinaryTreeNode.constructBinaryTree(List.of(-1,2,5))
            ));
        });
    }

}