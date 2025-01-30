public class TicTacToe {
public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        int[][] moves = {
            {0, 0}, {0, 1}, {1, 1}, {1, 2}, {2, 0}, {2, 2}
        };
        displayBoard(board);
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            char currentPlayer = (i % 2 == 0) ? 'X' : 'O'; 
            board[row][col] = currentPlayer;
            System.out.println("Move " + (i + 1) + ": Player " + currentPlayer);
            displayBoard(board);
            if (checkWinner(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                return; 
            }
        }
        System.out.println("It's a draw!");
    }
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }
    public static boolean checkWinner(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
          return false;
    }
}

