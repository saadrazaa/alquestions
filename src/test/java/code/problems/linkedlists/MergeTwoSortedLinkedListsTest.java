package code.problems.linkedlists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLinkedListsTest {

    @Test
    @DisplayName("merge the two given linked lists")
    void test(){
        assertAll(()->{
            assertEquals(List.of(1,1,2,3,4,4), ListNode.toArray(
                    MergeTwoSortedLinkedLists.merge(
                            ListNode.toLinkedList(List.of(1,2,4)),
                            ListNode.toLinkedList(List.of(1,3,4))
                    )
            ));
        });
        assertAll(()->{
            assertEquals(List.of(0), ListNode.toArray(
                    MergeTwoSortedLinkedLists.merge(
                            ListNode.toLinkedList(List.of()),
                            ListNode.toLinkedList(List.of(0))
                    )
            ));
        });
        assertAll(()->{
            assertEquals(List.of(), ListNode.toArray(
                    MergeTwoSortedLinkedLists.merge(
                            ListNode.toLinkedList(List.of()),
                            ListNode.toLinkedList(List.of())
                    )
            ));
        });
    }
}