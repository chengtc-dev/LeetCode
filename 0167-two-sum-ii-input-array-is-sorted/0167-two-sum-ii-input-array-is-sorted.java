class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = numbers.length - 1;
        int[] solution = new int[2];
        
        while (index1 < index2) {
            int sum = numbers[index1] + numbers[index2];
            
            if (sum > target) {
                index2--;
            } else if (sum < target) {
                index1++;
            } else {
                solution[0] = ++index1;
                solution[1] = ++index2;
                break;
            }
        }
        
        return solution;
    }
}