class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode fast=head;
        for(int i=1;i<k;i++){
            first=first.next;
            fast=fast.next;
        }
        ListNode second=head;
        while(fast.next!=null){
            second=second.next;
            fast=fast.next;
        }
        //swap 
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        return head;
        
    }
}
