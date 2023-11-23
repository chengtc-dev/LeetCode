class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) 
            if (set.add(num)) nums[k++] = num;
        
        return k;
    }
}