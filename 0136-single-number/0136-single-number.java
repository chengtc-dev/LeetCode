class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                answer = num;
            }
        }

        return answer;
    }
}