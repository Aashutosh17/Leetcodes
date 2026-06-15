// Iteration Soln: 
/*
Create a dummy node and a node pointer pointing to it.
While both lists have nodes:
Compare list1.val and list2.val.
Attach the smaller node to node.next.
Move forward in the chosen list.
Move node to node.next.
When one list becomes empty:
Attach the remaining nodes of the other list to node.next.
Return dummy.next, which is the head of the merged list.

*/


public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }

        return dummy.next;
    }
}