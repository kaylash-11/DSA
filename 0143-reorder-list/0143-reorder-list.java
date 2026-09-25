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
class Solution {
    public void reorderList(ListNode head) {
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode curr=slow.next;
    slow.next=null;
    ListNode prev=null;
    ListNode fwd=null;
    while(curr!=null)
    {
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
    }
     ListNode dummy=new ListNode(-1);
     ListNode d=dummy;
     ListNode t1=head;
     ListNode t2=prev;
     d.next=t1;
     d=d.next;
     while(t1!=null && t2!=null)
     {
       t1=t1.next; 
       d.next=t2;
       d=d.next;
       t2=t2.next;
       d.next=t1;
       d=d.next;
     }
     return;
    }
}