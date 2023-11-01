class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);
        backTrack(0, target, candidates, ans, new ArrayList<>());

        return ans;
    }

    private void backTrack (int start, int remain, int[] candidates, List<List<Integer>> ans, List<Integer> combination) {
        if (remain < 0) return;
        else if (remain == 0) ans.add(new ArrayList<>(combination));
        else {
            for (int i = start; i < candidates.length; i++) {
                combination.add(candidates[i]);
                backTrack(i, remain - candidates[i], candidates, ans, combination);
                combination.remove(combination.size() - 1);
            }
        }
    }
}