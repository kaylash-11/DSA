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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null)
        {
            if(st.size()==0) st.push(temp);
            else{
                while(st.size()>0)
                {
                    if(temp.val>st.peek().val) st.pop();
                   
                    else{
                        st.push(temp);
                        break;
                    }
                }
            }
          if(st.size()==0) st.push(temp);
            temp=temp.next;
        }
        ListNode tmp=null;
        while(st.size()>0)
        {
            if(tmp==null)
            {
                tmp=st.pop();
                tmp.next=null;
            }
            else{
                ListNode temp1=st.pop();
                temp1.next=tmp;
                 tmp=temp1;
            }
        }
        return tmp;
    }
}