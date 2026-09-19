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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dumy=new ListNode(-1);
        ListNode tmp=dumy;
        ListNode temp=head;
        if(temp==null) return null;
        while(temp.next!=null)
        {
           if(temp.val!=val)
           {
            tmp.next=temp;
            tmp=temp;
           }
           temp=temp.next;
        }
        if(temp.val==val) tmp.next=null;
        else tmp.next=temp;
        return dumy.next;

    }
}