class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while (n != 1) {
            int sum = 0;
            
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;    
                n /= 10;
            }
            
            if (!set.add(sum)) {
                return false;
            }
            
            n = sum;
        }
        
        return true;
    }
}