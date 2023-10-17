class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int i = 0;

        for (int num : nums) {
            if (num != 0) {
                temp[i] = num;
                i++;
            }
        }

        for (int j = i; j < n; j++) {
            temp[j] = 0;
        }

        for (int j = 0; j < n; j++) {
            nums[j] = temp[j];
        }
    }
}