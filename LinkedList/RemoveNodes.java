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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        
        head=reverse(head);
        ListNode temp=head;
        int maxVal=head.val;
        while(temp!=null&&temp.next!=null){
            if(temp.next.val<maxVal){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
                maxVal=temp.val;
            }
        }
        return reverse(head);
    }
}
