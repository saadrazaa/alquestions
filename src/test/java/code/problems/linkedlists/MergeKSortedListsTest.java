package code.problems.linkedlists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    List<ListNode> toBeMergedKLists;
    List<ListNode> toBeMergedKLists2;

    @BeforeEach
    void setup(){
        toBeMergedKLists = new ArrayList<>();
        toBeMergedKLists2 = new ArrayList<>();

        toBeMergedKLists.add(ListNode.toLinkedList(List.of(1,4,5)));
        toBeMergedKLists.add(ListNode.toLinkedList(List.of(1,3,4)));
        toBeMergedKLists.add(ListNode.toLinkedList(List.of(2,6)));

        toBeMergedKLists2.add(ListNode.toLinkedList(List.of()));
    }

    @Test
    void test(){
        assertAll(()->{
            assertEquals(List.of(1,1,2,3,4,4,5,6), ListNode.toArray(
                    MergeKSortedLists.mergeKLists(toBeMergedKLists
                    ))
            );
            assertEquals(List.of(), ListNode.toArray(
                    MergeKSortedLists.mergeKLists(List.of()
                    ))
            );
            assertEquals(List.of(), ListNode.toArray(
                    MergeKSortedLists.mergeKLists(toBeMergedKLists2)
                    )
            );
        });
    }

}