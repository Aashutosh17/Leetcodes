/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
1 . Start both pointers at the head of the list.

2 . Move slow by 1 step and fast by 2 steps.

3 . If fast meets slow, a cycle exists.

4 . If fast reaches the end (null), no cycle exists.

🐢 moves 1 step, 🐇 moves 2 steps. If they meet, there's a cycle! 

*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
    return false;
    }
}
