import java.util.Scanner;

public class TicTacToe {
    public static void printBoard(char[][] board) {
        System.out.println("  ___________ ");
        System.out.println(" |           |");
        for (int row = 2; row >= 0; row--) {
            System.out.print(" | "+row+" | ");
            for (int col = 2; col >= 0; col--) {
                System.out.print(board[row][col]+" ");
            }
            System.out.println("|");
        }
        System.out.println(" | --|------ |");
        System.out.println(" | 0 | 0 1 2 |");
        System.out.println(" |___|_______|");
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        //Initializing the empty board
        for (int row = 2; row >= 0; row--) {
            for (int column = 2; column >= 0; column--) {
                board[row][column] = ' ';
            }
        }
        
        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //flag variables
        boolean gameOver = false;
        char c = 'O';
        int row,col,count=0;


        while (!gameOver && count <9){
            printBoard(board);
            if (c=='O'){
                System.out.println("Turn for X");
                System.out.print("Enter row - ");
                row = sc.nextInt();
                System.out.print("Enter column - ");
                col = sc.nextInt();

                board[row][col] = 'O';
                c = 'X';
            } else{
                System.out.println("Turn for O");
                System.out.print("Enter row - ");
                row = sc.nextInt();
                System.out.print("Enter column - ");
                col = sc.nextInt();

                board[row][col] = 'X';
                c = 'O';
            }
            count++;
        }
    }
}