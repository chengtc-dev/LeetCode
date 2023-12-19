class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder answer = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            answer.append(words[i]);
            if (i != 0) answer.append(" ");
        }
        
        return answer.toString().trim();
    }
}