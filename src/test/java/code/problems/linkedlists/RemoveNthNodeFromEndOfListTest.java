package code.problems.linkedlists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    @Test
    @DisplayName("remove the nth node from the end of linked list")
    void test(){
        assertAll(() -> {
            assertEquals(List.of(1,2,3,5), ListNode.toArray(
                    RemoveNthNodeFromEndOfList.removeNthNode(
                            ListNode.toLinkedList(List.of(1,2,3,4,5)), 2))
            );
            assertEquals(List.of(), ListNode.toArray(
                    RemoveNthNodeFromEndOfList.removeNthNode(
                            ListNode.toLinkedList(List.of(1)), 1))
            );
            assertEquals(List.of(1), ListNode.toArray(
                    RemoveNthNodeFromEndOfList.removeNthNode(
                            ListNode.toLinkedList(List.of(1,2)), 1))
            );
        });
    }
}