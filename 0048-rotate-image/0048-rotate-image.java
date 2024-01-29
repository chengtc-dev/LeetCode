class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i + j < n) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - j][n - i];
                    matrix[n - j][n - i] = temp;
                }
            }
        }
        
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j <= n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i][j];
                matrix[n - i][j] = temp;
            }
        }
        
    }
}