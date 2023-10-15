class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int answer = 0, pre = 4000;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (pre < value) {
                value -= pre * 2;
            }
            answer += value;
            pre = value;
        }

        return answer;
    }
}