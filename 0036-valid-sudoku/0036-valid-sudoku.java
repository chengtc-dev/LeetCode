class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    String cell = "(" + board[i][j] + ")";
                    if (!set.add(i + cell) ||
                        !set.add(cell + j) ||
                        !set.add(i / 3 + cell + j / 3)) 
                        return false;
                }
            }
        }
        
        return true;
    }
}