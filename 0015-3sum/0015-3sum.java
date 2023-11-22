class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0){
                    l++;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    triplets.add(triplet);
                    r--;
                    l++;
                }
            }
        }
        
        return new ArrayList(triplets);
    }
}