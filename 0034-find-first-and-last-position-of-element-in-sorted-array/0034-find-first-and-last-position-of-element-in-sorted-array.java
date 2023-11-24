class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[] {-1, -1};
        int l = 0, r = nums.length - 1;
        
        while ((range[0] == -1 || range[1] == -1) && l <= r) {
            if (nums[l] == target) range[0] = l;
            else l++;
            if (nums[r] == target) range[1] = r;
            else r--;
        }
        
        return range;
    }
}