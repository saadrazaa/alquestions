package code.problems.linkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    ListNode cycleListHead1;
    ListNode cycleListHead2;
    ListNode listHead;

    @BeforeEach
    void setup(){
        cycleListHead1 = ListNode.toLinkedList(List.of(3,2,0,4));
        cycleListHead2 = ListNode.toLinkedList(List.of(1,2));
        listHead = ListNode.toLinkedList(List.of(1));

        ListNode tmp = ListNode.getNodeAt(cycleListHead1, 1);
        ListNode tmp1 = cycleListHead1;
        while (tmp1 != null && tmp1.next != null){
            tmp1 = tmp1.next;
        }
        tmp1.next = tmp;

        tmp = ListNode.getNodeAt(cycleListHead2, 1);
        tmp1 = cycleListHead2;
        while (tmp1 != null && tmp1.next != null){
            tmp1 = tmp1.next;
        }
        tmp1.next = tmp;
    }

    @Test
    void test(){
        assertTrue(LinkedListCycle.hasCycle(cycleListHead1));
        assertTrue(LinkedListCycle.hasCycle(cycleListHead2));
        assertFalse(LinkedListCycle.hasCycle(listHead));
    }
}