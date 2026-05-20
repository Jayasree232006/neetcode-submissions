class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            // store next node
            ListNode next = curr.next;

            // reverse link
            curr.next = prev;

            // move pointers
            prev = curr;
            curr = next;
        }

        return prev;
    }
}