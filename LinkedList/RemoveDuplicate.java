class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        // Start from head node
        ListNode current = head;

        // Traverse linked list
        while (current != null &&
               current.next != null) {

            /*
             * Duplicate node found
             */

            if (current.val ==
                current.next.val) {

                // Skip duplicate node
                current.next =
                    current.next.next;

            } else {

                // Move forward
                current = current.next;
            }
        }

        return head;
    }
}
