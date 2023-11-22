class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int reversed = 0, temp = x;
        
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        
        return x == reversed;
    }
}