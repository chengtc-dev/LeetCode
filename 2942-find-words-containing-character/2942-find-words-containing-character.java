class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indiceArray = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                indiceArray.add(i);
            }
        }
        
        return indiceArray;
    }
}