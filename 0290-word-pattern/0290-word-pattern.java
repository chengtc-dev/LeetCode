class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> pMap = new HashMap<>(); 
        Map<String, Character> sMap = new HashMap<>(); 

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);

            if (!pMap.containsKey(pChar)) {
                pMap.put(pChar, words[i]);
            }
            if (!sMap.containsKey(words[i])) {
                sMap.put(words[i], pChar);
            }
            if (!words[i].equals(pMap.get(pChar)) || sMap.get(words[i]) != pChar) {
                return false;
            }
        }

        return true;
    }
}