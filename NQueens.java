public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        if (solveNQueens(board, 0, n)) {
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static boolean solveNQueens(int[][] board, int col, int n) {
        if (col >= n) {
            return true;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                if (solveNQueens(board, col + 1, n)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {

        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
