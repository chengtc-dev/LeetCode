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
    public boolean isPalindrome(ListNode head) {
        List<Integer> numsArray = new ArrayList<>();
        ListNode current = head;
        
        while (current != null) {
            numsArray.add(current.val);
            current = current.next;
        }
        
        int n = numsArray.size();
        
        for (int i = 0; i < n / 2; i++) {
            if (numsArray.get(i) != numsArray.get(n - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}