package code.problems.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @Test
    void test(){
        List<Integer> t1 = new ArrayList<>(); t1.add(1); t1.add(null); t1.add(2);
        assertAll(()->{
            assertTrue(SameTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(1, 2, 3)),
                    BinaryTreeNode.constructBinaryTree(List.of(1, 2, 3))
            ));
            assertFalse(SameTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(1, 2)),
                    BinaryTreeNode.constructBinaryTree(t1)
            ));
            assertFalse(SameTree.check(
                    BinaryTreeNode.constructBinaryTree(List.of(1, 2, 1)),
                    BinaryTreeNode.constructBinaryTree(List.of(1, 1, 2))
            ));
        });
    }
}