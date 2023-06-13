package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {

    List<Integer> l1;

    @BeforeEach
    void setup(){
        l1 = new ArrayList<>(List.of(-10, 9, 20));
        l1.add(null);l1.add(null);l1.add(15);l1.add(7);
    }

    @Test
    void test(){
        assertAll(()->{
            assertEquals(6, BinaryTreeMaximumPathSum.find(
                    BinaryTreeNode.constructBinaryTree(List.of(1,2,3))
            ));
            assertEquals(42, BinaryTreeMaximumPathSum.find(
                    BinaryTreeNode.constructBinaryTree(l1)
            ));
        });
    }

}