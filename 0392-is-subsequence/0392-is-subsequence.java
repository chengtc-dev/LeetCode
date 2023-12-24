class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointerS = 0, pointerT = 0;
        
        while (pointerT < t.length()) {
            if (s.length() == pointerS) return true;
            if (s.charAt(pointerS) == t.charAt(pointerT)) pointerS++;
            pointerT++;
        }
        
        return pointerS == s.length() ? true : false;
    }
}