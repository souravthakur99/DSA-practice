class Solution {
    public int pairSum(ListNode head) {

        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is now start of second half


        // 2. Reverse second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // prev is head of reversed second half


        // 3. Calculate maximum twin sum
        int ans = 0;

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            ans = Math.max(ans, first.val + second.val);

            first = first.next;
            second = second.next;
        }

        return ans;
    }
}
