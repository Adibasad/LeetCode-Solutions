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
    public ListNode deleteMiddle(ListNode head) {

        int n=0;
        ListNode curr=head;
        if(curr.next==null) return null;

        while(curr!=null)
        {
          n++;
          curr=curr.next;
        }

        curr=head;
        n=n/2;

        System.out.println(curr.val+" "+n);

        for(int i=0;i<n-1;i++) curr=curr.next;  

        // System.out.println(curr.val);
        // System.out.println(curr.next.val);
        curr.next=curr.next.next;

        return head;
    }
}