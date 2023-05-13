package code.problems.linkedlists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseALinkedListTest {

    @Test
    @DisplayName("reverse a linked list")
    void test(){
        assertAll(()->{
            assertEquals(List.of(3,2,1), ListNode.toArray(
                    ReverseALinkedList.reverse(
                            ListNode.toLinkedList(List.of(1,2,3))
                    )
            ));
        });
        assertAll(()->{
            assertEquals(List.of(1), ListNode.toArray(
                    ReverseALinkedList.reverse(
                            ListNode.toLinkedList(List.of(1))
                    )
            ));
        });
        assertAll(()->{
            assertEquals(List.of(), ListNode.toArray(
                    ReverseALinkedList.reverse(
                            ListNode.toLinkedList(List.of())
                    )
            ));
        });
    }
}