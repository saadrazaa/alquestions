package code.problems.linkedlists;

/*
Problem:
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 */
public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthNode(ListNode head, int n){
        // using two pointers spaced by n and iterate the pointers to the end of the list
        // the first/left pointer will be at the node preceding the node to be removed

        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = head;

        while( n > 0 && second != null){
            second = second.next;
            n -= 1;
        }

        while(second != null){
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;

        return dummy.next;
    }
}
