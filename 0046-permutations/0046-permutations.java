class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(new ArrayList<>(), nums, ans);

        return ans;
    }

    private void backtrack (List<Integer> current, int[] nums, List<List<Integer>> ans) {
        if (current.size() == nums.length) ans.add(new ArrayList<>(current));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (current.contains(nums[i])) continue;
                current.add(nums[i]);
                backtrack(current, nums, ans);
                current.remove(current.size() - 1);
            }
        }
    }
}