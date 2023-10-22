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

        // count total nodes
        while (current != null) {
            n++;
            current = current.next;
        }
        if (n == 1) return null;

        n = n / 2 - 1;
        // find the node before middle node
        for (current = head; n != 0; current = current.next, n--);
        // delete middle node
        if (current.next != null) current.next = current.next.next;
        // for middle node in last
        else current.next = null; 

        return head;
    }
}