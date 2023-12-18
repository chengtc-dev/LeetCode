class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int current = 1;
        
        answer[0] = 1;
        
        for (int i = 1; i < nums.length; i++) {
            current *= nums[i - 1];
            answer[i] = current;
        }
        
        current = 1;
        
        for (int i = nums.length - 2; i >= 0; i--) {
            current *= nums[i + 1];
            answer[i] *= current;
        }

        
        return answer;
    }
}