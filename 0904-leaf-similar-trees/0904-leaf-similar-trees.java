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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1 = helper(root1, list1);
        list2 = helper(root2, list2);
        if (list1.size() != list2.size()) return false;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) return false;
        }

        return true;
    }

    private List<Integer> helper (TreeNode root, List<Integer> list) {
        if (root == null) return list;
        
        list = helper(root.left, list);
        if (root.left == null && root.right == null) list.add(root.val);
        list = helper(root.right, list);

        return list;
    }
}