class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }

        int res = 0;
        
        for (int num : nums) {
            if (set.contains(num)) {
                int upperNum = num + 1, lowerNum = num - 1;
                
                while (set.contains(upperNum)) {
                    set.remove(upperNum);
                    upperNum++;
                }
                
                while (set.contains(lowerNum)) {
                    set.remove(lowerNum);
                    lowerNum--;
                }
                
                res = Math.max(res, upperNum - lowerNum - 1);
            }
        }
        
        return res;
    }
}