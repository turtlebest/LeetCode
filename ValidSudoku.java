public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board == null) {
            return false;
        }
        //for row and column
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set1 = new HashSet<Integer>();
            HashSet<Integer> set2 = new HashSet<Integer>();
            
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if(board[i][j] >= '1' && board[i][j] <='9') {
                        if (!set1.add(board[i][j] - '0')) {
                            return false;
                        }
                    }
                }
                
                if (board[j][i] != '.') {
                    if(board[j][i] >= '1' && board[j][i] <='9') {
                        if (!set2.add(board[j][i] - '0')) {
                            return false;
                        }
                    }
                }
            }
        }
        
        //for 3x3 matrix
        int i = 1;
        int p = 0;
        int x = 0;
        
        while(i <= 9) {
            HashSet<Integer> set3 = new HashSet<Integer>();
            for (int j = p ; j < p+3; j++) {
                for (int k = x ; k < x+3; k++) {
                    if (board[j][k] != '.') {
                        if(board[j][k] >= '1' && board[j][k] <='9') {
                            if (!set3.add(board[j][k] - '0')) {
                                return false;
                            }
                        }
                    }
                }
            }
            
            if (i%3 == 0) {
                x = 0;
                p += 3;
            } else {
                x += 3;
            }
            i++;
        }
        return true;
        
    }
}