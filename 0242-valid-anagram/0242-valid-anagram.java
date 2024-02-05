class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char letter : s.toCharArray()) {
            int count = map.getOrDefault(letter, 0);
            map.put(letter, ++count);
        }
        
        for (char letter : t.toCharArray()) {
            int count = map.getOrDefault(letter, 0);
            if (count == 0) {
                return false;
            }
            map.put(letter, --count);
        }
        
        return true;
    }
}