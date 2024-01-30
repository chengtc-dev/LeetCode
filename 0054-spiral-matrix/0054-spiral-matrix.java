class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> elements = new ArrayList<>();
        
        int top = 0, buttom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= buttom && left <= right) {
            for (int i = left; i <= right; i++) {
                elements.add(matrix[top][i]);
            }
            
            top++;
            
            for (int i = top; i <= buttom; i++) {
                elements.add(matrix[i][right]);
            }
            
            right--;
            
            if (top <= buttom) {
                for (int i = right; i >= left; i--) {
                    elements.add(matrix[buttom][i]);
                }
            }
            
            buttom--;
            
            if (left <= right) {
                for (int i = buttom; i >= top; i--) {
                    elements.add(matrix[i][left]);
                }
            }
            
            left++;
        }
        
        return elements;
    }
}