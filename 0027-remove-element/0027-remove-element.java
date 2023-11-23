class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
        
        for (int num : nums) 
            if (num != val) k++;
        
        return k;
    }
    
    private void swap (int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}