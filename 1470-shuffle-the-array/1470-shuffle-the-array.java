class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        int i = 0, j = n, k = 0;
        
        while (k < n * 2) {
            if (k % 2 == 0) {
                ans[k++] = nums[i++];                
            } else {
                ans[k++] = nums[j++];                
            }
        }
        
        return ans;
    }
}