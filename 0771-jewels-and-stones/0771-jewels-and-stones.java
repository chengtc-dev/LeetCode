class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        
        for (Character stone : stones.toCharArray()) {
            for (Character jewel : jewels.toCharArray()) {
                if (stone == jewel) {
                    num++;
                }
            }
        }
        
        return num;
    }
}