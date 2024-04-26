class Solution {
    public int missingNumber(int[] nums) {
        int missingNumber = 0;
        int bucket[] = new int[nums.length + 1];
        
        for (int num : nums) {
            bucket[num]++;
        }
        
        for (int i = 1; i < nums.length + 1; i++) {
            if (bucket[i] == 0) {
                missingNumber = i;
                break;
            }
        }
        
        return missingNumber;
    }
}