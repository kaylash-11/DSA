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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans=new int[2];
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=head.next.next;
        int idx=1;
        int fidx=-1;
        int lidx=-1;
        int pidx=-1;
        int flag=0;
        int mindist=Integer.MAX_VALUE;
        while(c!=null)
        {
            if((b.val>c.val && b.val>a.val)||(b.val<c.val && b.val<a.val))
            {
                if(fidx==-1) fidx=idx;
                pidx=lidx;
                if(lidx!=-1)
                {
                    pidx=idx-lidx;
                    mindist=Math.min(pidx,mindist);
                }
                lidx=idx;
                flag++;
            }
            idx++;
            c=c.next;
            a=a.next;
            b=b.next;
        }
        if(flag>=2){
        ans[1]=lidx-fidx;
        ans[0]=mindist;
        }
        else{
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;




    }
}