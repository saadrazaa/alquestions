package code.problems.linkedlists;

import java.util.ArrayList;
import java.util.List;

/*
Problem:
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

Constraints:
k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.
 */
public class MergeKSortedLists {

    public static ListNode mergeKLists(List<ListNode> lists){

        if(lists == null || lists.size() == 0){
            return null;
        }

        while(lists.size() > 1){
            List<ListNode> mergedLists = new ArrayList<>();

            for(int i = 0; i < lists.size(); i+=2){
                ListNode l1 = lists.get(i);
                ListNode l2 = (i+1) < lists.size() ? lists.get(i+1) : null;

                mergedLists.add(merge(l1, l2));
            }

            lists = mergedLists;
        }

        return lists.get(0);
    }

    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0, null);
        ListNode tail = dummy;

        while(l1 != null && l2 != null){

            if(l1.value < l2.value){
                tail.next = l1;
                l1 = l1.next;
            }
            else {
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

        return dummy.next;
    }
}
