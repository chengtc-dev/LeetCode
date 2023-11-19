class Solution {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        int n = s.length(), max = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                String substring = s.substring(i, j);
                if (!isPalindrome(substring)) continue;
                if (substring.length() >= longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }
        
        return longestPalindrome;
    }
    
    private boolean isPalindrome (String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        
        return true;
    }
}