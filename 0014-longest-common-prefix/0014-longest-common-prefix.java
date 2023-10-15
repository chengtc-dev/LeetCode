class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = 201;
        String answer = "";

        // find shortest string length
        for (String str : strs) {
            n = Math.min(n, str.length());
        }

        for (int i = 0; i < n; i++) {
            char commonChar = strs[0].charAt(i);
            for (String str : strs) {
                if (commonChar != str.charAt(i)) {
                    return answer;
                }
            }
            answer += commonChar;
        }

        return answer;
    }
}