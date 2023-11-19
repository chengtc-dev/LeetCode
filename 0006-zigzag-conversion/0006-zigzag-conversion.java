class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] ans = new StringBuilder[numRows];
        int index = 0, n = s.length();
        
        for (int i = 0; i < ans.length; i++) 
            ans[i] = new StringBuilder(); 
        
        while (index < n) {
            for (int i = 0; index < n && i < numRows; i++)
                ans[i].append(s.charAt(index++));
            for (int i = numRows - 2; index < n && i > 0; i--)
                ans[i].append(s.charAt(index++));
        }
        
        for (int i = 1; i < ans.length; i++) 
            ans[0].append(ans[i]); 
        
        return ans[0].toString();
    }
}