package code.problems.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBTFromPreAndInOrderTraversalsTest {

    List<Integer> l1;

    @BeforeEach
    void setup(){
        l1 = new ArrayList<>(List.of(3,9,20));
        l1.add(null);l1.add(null);l1.add(15);l1.add(7);
    }
    @Test
    void test(){
        assertAll(()->{
            assertEquals(BinaryTreeNode.toArrayList(
                    BinaryTreeNode.constructBinaryTree(l1)),
                    BinaryTreeNode.toArrayList(
                    ConstructBTFromPreAndInOrderTraversals.build(
                            new ArrayList<>(List.of(3,9,20,15,7)),
                            new ArrayList<>(List.of(9,3,15,20,7))
                    )
            ));
            assertEquals(BinaryTreeNode.toArrayList(
                            BinaryTreeNode.constructBinaryTree(List.of(-1))),
                    BinaryTreeNode.toArrayList(
                            ConstructBTFromPreAndInOrderTraversals.build(
                                    new ArrayList<>(List.of(-1)),
                                    new ArrayList<>(List.of(-1))
                            )
                    ));
        });
    }
}