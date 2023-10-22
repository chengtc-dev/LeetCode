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
    public int pairSum(ListNode head) {
        List<ListNode> list = new ArrayList();
        int max = 0;

        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            int sum = list.get(i).val + list.get(list.size() - 1 - i).val;
            max = Math.max(max, sum);
        }

        return max;
    }
}