class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        backtrack(new ArrayList<>(), 0, nums, subsets);

        return subsets;
    }

    private void backtrack(List<Integer> subset, int start,int[] nums, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(subset, i + 1, nums, subsets);
            subset.remove(subset.size() - 1);
        }
    }
}