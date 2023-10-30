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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) { return null; }

        List<Integer> nums = new ArrayList<>();

        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }

        return constructBST(nums, 0, nums.size() - 1);
    }

    private TreeNode constructBST (List<Integer> nums, int left, int right) {
        if (left > right) { return null; }

        int mid = left + (right - left) / 2;
        TreeNode newNode = new TreeNode(nums.get(mid));
        newNode.left = constructBST(nums, left, mid - 1);
        newNode.right = constructBST(nums, mid + 1, right);

        return newNode;
    }
}