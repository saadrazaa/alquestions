package code.problems.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListNode {

    public Integer value;
    public ListNode next;

    public ListNode(Integer value, ListNode next){
        this.value = value;
        this.next = next;
    }

    public static List<Integer> toArray(ListNode head){
        List<Integer> arr = new ArrayList<>();

        while (head != null){
            arr.add(head.value);
            head = head.next;
        }

        return arr;
    }

    public static ListNode toLinkedList(List<Integer> nums){
        if(nums.size() == 0){
            return null;
        }

        ListNode curr = new ListNode(nums.get(0), null);

        ListNode head = curr;

        for(int i = 1; i < nums.size(); i++){
            curr.next = new ListNode(nums.get(i), null);
            curr = curr.next;
        }

        return head;
    }

    public static ListNode getNodeAt(ListNode head, int index){

        ListNode tmp = head;

        while (index > 0 && tmp != null){
            tmp = tmp.next;
            index -= 1;
        }

        return tmp;

    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value=" + value +'}';
    }
}
