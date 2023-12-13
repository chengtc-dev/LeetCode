class Solution {
    public boolean canJump(int[] nums) {
        int fariest = nums[0];
        
        for (int i = 1; i < nums.length - 1; i++) {
            if (fariest < i) return false;
            if (i + nums[i] > fariest)
                fariest = i + nums[i];
        }
        
        return fariest >= nums.length - 1;
    }
}