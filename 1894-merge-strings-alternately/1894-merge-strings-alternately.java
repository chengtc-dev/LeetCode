class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        StringBuilder ans = new StringBuilder();

        for (int i = 0, p1 = 0, p2 = 0; i < n1 + n2; i++, p1++, p2++) {
            if (p1 < n1) {
                ans.append(word1.charAt(p1));
            }
            if (p2 < n2) {
                ans.append(word2.charAt(p2));
            }
        }

        return ans.toString();
    }
}