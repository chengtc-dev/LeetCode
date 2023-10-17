class Solution {
    public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();

        try {
            return x < 0 ? Integer.valueOf(reversed) * -1 : Integer.valueOf(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}