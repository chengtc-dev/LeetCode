class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        backTrack("", 0, 0, n, ans);

        return ans;
    }

    private void backTrack (String currentStr, int open, int close, int max,
     List<String> ans) {
        if (currentStr.length() == max * 2) ans.add(currentStr);
        if (open < max) backTrack(currentStr + "(", open + 1, close, max, ans);
        if (open > close) backTrack(currentStr + ")", open, close + 1, max, ans);
    }
}
