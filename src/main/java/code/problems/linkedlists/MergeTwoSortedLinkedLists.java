package code.problems.linkedlists;

/*
Problem:
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLinkedLists {

    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode placeholder = new ListNode(null, null);
        ListNode tail = placeholder;

        while(l1 != null && l2 != null){

            if( l1.value < l2.value){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        if(l1 != null){
            tail.next = l1;
        }
        if(l2 != null){
            tail.next = l2;
        }

        return placeholder.next;
    }
}
