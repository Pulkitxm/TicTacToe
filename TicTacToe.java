public class TicTacToe {
    public static void printBoard(char[][] board) {
        System.out.println("  ___________ ");
        System.out.println(" |           |");
        for (int row = 2; row >= 0; row--) {
            System.out.print(" | "+row+" | ");
            for (int column = 2; column >= 0; column--) {
                System.out.print(board[row][0]+" ");
            }
            System.out.println("|");
        }
        System.out.println(" | --|------ |");
        System.out.println(" | 0 | 0 1 2 |");
        System.out.println(" |___|_______|");
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int row = 2; row >= 0; row--) {
            for (int column = 2; column >= 0; column--) {
                board[row][column] = ' ';
            }
        }

        printBoard(board);
    }
}