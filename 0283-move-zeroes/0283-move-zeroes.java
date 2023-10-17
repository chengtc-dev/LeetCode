class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] copyNums = new int[n];
        int idx = 0;

        Arrays.fill(copyNums, 0);

        for (int num : nums) {
            if (num != 0) {
                copyNums[idx++] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = copyNums[i];
        }
    }
}