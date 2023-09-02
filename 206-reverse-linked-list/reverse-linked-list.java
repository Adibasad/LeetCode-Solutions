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
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null) return head;
        ListNode before=null;
        ListNode prev=head;
        ListNode curr=head.next;

        while(curr!=null)
        {
            prev.next=before;
            before=prev;
            prev=curr;
            curr=curr.next;
            
            System.out.println(prev.val+" ");
        }
        prev.next=before;
        // curr=curr.next;

        return prev;
    }
}