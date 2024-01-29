class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!seen.add(board[i][j] + " in row " + j) ||
                        !seen.add(board[i][j] + " in column " + i) ||
                        !seen.add(board[i][j] + " in sub-box " + j / 3 + "-" + i / 3)
                       ) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}