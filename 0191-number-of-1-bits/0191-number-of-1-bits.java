class Solution {
    public int hammingWeight(int n) {
        int countSetBits = 0;
        
        while (n > 0) {
            if (n % 2 == 1) {
                countSetBits++;
            }
            
            n /= 2;
        }
        
        return countSetBits;
    }
}