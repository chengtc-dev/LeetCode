class Solution {
    public int hIndex(int[] citations) {
        int hIndex = 1;
        
        Arrays.sort(citations);
        
        for (int i = citations.length - 1; i >= 0; i--) {
            if (hIndex > citations[i]) break;
            hIndex++;
        }
        
        return hIndex - 1;
    }
}