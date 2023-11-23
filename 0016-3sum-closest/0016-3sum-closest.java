class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closet = nums[0] + nums[1] + nums[2], n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - closet) > Math.abs(target - sum)) closet = sum;
                if (sum < target) l++;
                else r--;
            }
        }
        
        return closet;
    }
}