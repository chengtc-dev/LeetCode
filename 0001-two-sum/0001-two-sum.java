class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                answer[0] = map.get(nums[i]);
                answer[1] = i;
                break;
            }
            int diff = target - nums[i];
            map.put(diff, i);
        }

        return answer;
    }
}