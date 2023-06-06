package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthOfBinaryTreeTest {

    List<Integer> testTree1;
    List<Integer> testTree2;

    @BeforeEach
    void setup(){
        testTree1 = new ArrayList<>();
        testTree1.add(3);testTree1.add(9);testTree1.add(20);
        testTree1.add(null);testTree1.add(null);
        testTree1.add(15);testTree1.add(7);

        testTree2 = new ArrayList<>();
        testTree2.add(1);testTree2.add(null);testTree2.add(2);
    }

    @Test
    void test(){
        assertAll(()->{
            assertEquals(3, MaxDepthOfBinaryTree.find(
                    BinaryTreeNode.constructBinaryTree(
                            testTree1
                    ))
            );
            assertEquals(2, MaxDepthOfBinaryTree.find(
                    BinaryTreeNode.constructBinaryTree(
                            testTree2
                    ))
            );
            assertEquals(0, MaxDepthOfBinaryTree.find(
                    BinaryTreeNode.constructBinaryTree(
                            List.of()
                    ))
            );
        });
    }

}