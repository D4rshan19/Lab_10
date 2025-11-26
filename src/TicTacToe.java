import java.util.Scanner;
public class TicTacToe {
    //Create board outside of main method
    static String [][] board = new String[3][3];

    public static void main(String[] args) {
        //Game simulation happens here
        Scanner scan = new Scanner(System.in);
        String player1 = "X";
        String player2 = "O";
        int p1row;
        int p1col;
        int p2row;
        int p2col;
        boolean player1Valid = false;
        boolean player2Valid = false;
        boolean gameOver = false;
        boolean playAgain = false;

        System.out.println("Welcome to Tic-Tac-Toe!");

        //This do-while loops allows multiple games to be played
        do {
            System.out.println("Do you want to play another game?");
            System.out.println();


            //This do-while loop keeps running while the game is still going
            //It stops once a winner or tie occurs
            do {
                displayBoard();
                clearBoard();


                //Player 1 - It loops until a valid move is made
                do {
                    System.out.println("Out of range. Please try again. ");

                } while (player1Valid);


                    //Player 2 - It loops until a valid move is made
                    do {
                        System.out.println("Out of range. Please try again.");

                    } while (player2Valid);


            } while (!gameOver);


        } while (!playAgain);

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
        if (board[row][col].equals("-")) {
            return true;
        }
        else {
            return false;
        }
    }

    //Checks to see if you won
    private static boolean isWin(String player) {
        return isColWin(player) || isRowWin(player) || isDiagonalWin(player);
    }

    //Checks to see if you won in a column
    private static boolean isColWin(String player) {
        for ( int c = 0; c < board.length; c++) {
            if (board[0][c].equals(player) && board[1][c].equals(player) && board[2][c].equals(player)) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    //Checks to see if you won in a row
    private static boolean isRowWin(String player) {
        for (int r = 0; r < board.length; r++) {
            if (board[r][0].equals(player) && board[r][1].equals(player) && board[r][2].equals(player)) {
                return true;
            }
            else {
                return false;
            }
        }
    }


    //Checks to see if you won diagonally
    private static boolean isDiagonalWin(String player) {
        //Checks top-left to bottom-right diagonal for a win
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true;
        }
        else {
            return false;
        }

        //Checks top-right to bottom-left diagonal for a win
        if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            return true;
        }
        else {
            return false;
        }
    }

    //Checks to see if there is a tie
    private static boolean isTie(String player1, String player2) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c].equals("-")) {
                    return false;
                }
                else {
                    return !isWin(player1) && !isWin(player2);
                }
            }
        }
    }
}
