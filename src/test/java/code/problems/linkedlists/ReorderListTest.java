package code.problems.linkedlists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {

    @Test
    @DisplayName("test the reorder function according to the structure specified in the problem statement")
    void test(){
        assertAll(() -> {
            assertEquals(List.of(1,5,2,4,3), ListNode.toArray(
                    ReorderList.reorder(
                            ListNode.toLinkedList(List.of(1,2,3,4,5))
                    )
            ));
            assertEquals(List.of(1,4,2,3), ListNode.toArray(
                    ReorderList.reorder(
                            ListNode.toLinkedList(List.of(1,2,3,4))
                    )
            ));
            assertEquals(List.of(1), ListNode.toArray(
                    ReorderList.reorder(
                            ListNode.toLinkedList(List.of(1))
                    )
            ));
        });
    }
}