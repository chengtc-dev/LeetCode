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
        int n = 0;
        ListNode current = head;

        while (current != null) {
            n++;
            current = current.next;
        }
        if (n == 1) return null;
        n = n / 2 - 1;
        for (current = head; n != 0; current = current.next, n--);
        if (current.next != null) current.next = current.next.next;
        else current.next = null;

        return head;
    }
}