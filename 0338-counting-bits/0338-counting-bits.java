class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int num = i, num1 = 0;
            while (num != 0) {
                if (num % 2 == 1) {
                    num1++;
                }
                num /= 2;
            }
            ans[i] = num1;
        }

        return ans;
    }
}