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
//1->2->3->4->5
//1->4->3->2->5
// too 2 point karwaoo 4 koo 3 karwaoo 2 koo aurr 1 karwaoo 3 koo bass yee yaad rakhoo
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
     ListNode dummy=new ListNode(-1);
     dummy.next=head;
     ListNode prev=dummy;
     for(int i=0;i<left-1;i++){
        prev=prev.next;
     }
     ListNode curr=prev.next;
     for(int i=0;i<right-left;i++){
        ListNode move=curr.next;
        curr.next=move.next;
        move.next=prev.next;
        prev.next=move;
     }
     return dummy.next;
    }
}
