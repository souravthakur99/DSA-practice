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
//hashset is needed as it will filter and search has the tc of o(1)
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> rem=new HashSet<>();
        for(int n:nums){
            rem.add(n);
        }
        ListNode dummy=new ListNode(0);
        //needed as without dummy we cannot check the head of linked list
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next!=null){
            if(rem.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return dummy.next;
        // ListNode dummy=new ListNode(0);
        // dummy.next=head;
        
       
        // for(int i=0;i<nums.length;i++){
        //     ListNode temp=dummy;
        //     while(temp.next!=null){
        //         if(temp.next.val==nums[i]){
        //             temp.next=temp.next.next;
        //         }
        //         else{
        //             temp=temp.next;
        //         }
        //     }
        // }
        // return dummy.next;
    }
}
