class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, slow = 0, fast = 0;

        while (fast < s.length()) {
            if (set.contains(s.charAt(fast))) {
                set.remove(s.charAt(slow++));
            } else {
                set.add(s.charAt(fast++));
                max = Math.max(max, set.size());
            }
        }

        return max;
    }
}