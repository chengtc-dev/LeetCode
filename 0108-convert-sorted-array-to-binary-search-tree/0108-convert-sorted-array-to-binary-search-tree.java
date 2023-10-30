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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) { return null; }

        return constructBST(nums, 0, nums.length - 1);
    }

    private TreeNode constructBST (int[] nums, int left, int right) {
        if (left > right) { return null; }

        int mid = left + (right - left) / 2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = constructBST(nums, left, mid - 1);
        newNode.right = constructBST(nums, mid + 1, right);

        return newNode;
    }
}