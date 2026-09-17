/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while( fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }
        if( fast==null) return false;
        if(fast.next ==null) return false;
        while(temp!=null)
        { 
           if(temp==slow) return true;
           temp=temp.next;
           slow=slow.next;
        }
        return false;
    }
}