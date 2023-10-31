class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        List<String> ans = new ArrayList<>();
        String[] keyboard = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        findCombinations("", digits, ans, keyboard);

        return ans;
    }

    private void findCombinations (String combination, String digits, List<String> ans, String[] keyboard) {
        if (digits.isEmpty()) {
            ans.add(combination);
        } else {
            String letters = keyboard[digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                findCombinations(combination + letter, digits.substring(1), ans, keyboard);
            }
        }
    }
}