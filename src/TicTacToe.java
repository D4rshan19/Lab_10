import java.util.Scanner;
public class TicTacToe {
    //Create board outside of main method
    static String [][] board = new String[3][3];

    public static void main(String[] args) {
        //Game simulation happens here
        Scanner scan = new Scanner(System.in);
        String Player1 = "X";
        String player2 = "O";
        int p1row;
        int p1col;
        int p2row;
        int p2col;
        boolean player1Valid = false;
        boolean player2Valid = false;
        boolean gameOver = false;
        boolean playAgain = false;
    }

    //Helper methods go here

    //Clearing Board
    private static void clearBoard() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = "-";
            }
        }
        //Printing a new line for the start of the next row
        System.out.println();
    }

    //Displays Board
    private static void displayBoard() {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.println( board[r][c]);
            }
        }
        //Printing a new line for the start of the next row
        System.out.println();
    }

    //Checks if move is valid
    private static boolean isValidMove(int row, int col) {
        if ()


    }

    //Checks to see if you won
    private static boolean isWin(String player) {

    }

    //Checks to see if you won in a column
    private static boolean isColWin(String player) {

    }

    //Checks to see if you won in a row
    private static boolean isRowWin(String player) {

    }

    //Checks to see if you won diagonally
    private static boolean isDiagonalWin(String player) {

    }

    //Checks to see if there is a tie
    private static boolean isTie(String player1, String player2) {

    }
}
