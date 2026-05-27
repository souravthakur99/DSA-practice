
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        
        while(head!=null){
            ListNode nex=head.next;
            head.next=prev;
            prev=head;
            head=nex;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null|| head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode firsthalf=head;
        ListNode secondhalf=reverse( slow.next);
    while(secondhalf!=null){
        if(secondhalf.val!=firsthalf.val) return false;
        else{
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
    }
    return true;
    }
}
