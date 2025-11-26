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
        boolean round = false;
        boolean gameOver = false;
        String playAgain = "";

        System.out.println("Welcome to Tic-Tac-Toe!");

        //This do-while loops allows multiple games to be played
        do {
            clearBoard();


            //This do-while loop keeps running while the game is still going
            //It stops once a winner or tie occurs
            do {
                if (isWin(player1)) {
                    System.out.println("Player 1 wins the round!");
                    break;
                } else if (isWin(player2)) {
                    System.out.println("Player 2 wins the round!");
                    break;
                } else if (isTie(player1, player2)) {
                    System.out.println("This round is a tie!");
                    break;
                }

                //Player 1 - It loops until a valid move is made
                do {
                    p1row = InputHelper.getRangedInt(scan, "Select the row you want for Player 1", 1, 3);
                    p1col = InputHelper.getRangedInt(scan, "Select the column you want for Player 1", 1, 3);


                    if (isValidMove(p1row - 1, p1col - 1)) {
                        player1Valid = true;
                    } else {
                        System.out.println("Error, invalid move. Please try again.");
                    }

                    board[p1row -1][p1col -1] = player1;
                    displayBoard();
                    if (isWin(player1) || isTie( player1, player2)) {
                        break;
                    }

                } while (!player1Valid);

                    //Player 2 - It loops until a valid move is made
                    do {
                        p2row = InputHelper.getRangedInt(scan, "Select the row you want for Player 2", 1, 3);
                        p2col = InputHelper.getRangedInt(scan, "Select the column you want for Player 2", 1, 3);

                        if (isValidMove(p2row - 1, p2col - 1)) {
                            player2Valid = true;
                        } else {
                            System.out.println("Error, invalid move. Please try again.");
                        }

                        board[p2row - 1][p2col - 1] = player2;
                        displayBoard();
                        if (isWin(player2) || isTie(player1, player2)) {
                            break;
                        }
                    } while (!player2Valid);

            } while (!round);

        } while (!gameOver);
        System.out.println();
        playAgain = InputHelper.getYNConfirm(scan, "Would you like to play again? [Y/N]");
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
        boolean valid = false;
        if (board[row][col].equals("-")) {
            valid = true;
        }
        return valid;
    }

    //Checks to see if you won
    private static boolean isWin(String player) {
        boolean win = false;
        if (isColWin(player) || isRowWin(player) || isDiagonalWin(player)) {
            win = true;
        }
        return win;
    }

    //Checks to see if you won in a column
    private static boolean isColWin(String player) {
        boolean colWin = false;
        for ( int c = 0; c < board.length; c++) {
            if (board[0][c].equals(player) && board[1][c].equals(player) && board[2][c].equals(player)) {
                return true;
            }
            else {
                return false;
            }
        }
        return colWin;
    }


    //Checks to see if you won in a row
    private static boolean isRowWin(String player) {
        boolean rowWin = false;
        for (int r = 0; r < board.length; r++) {
            if (board[r][0].equals(player) && board[r][1].equals(player) && board[r][2].equals(player)) {
                return true;
            }
            else {
                return false;
            }
        }
        return rowWin;
    }


    //Checks to see if you won diagonally
    private static boolean isDiagonalWin(String player) {
        boolean diagWin = false;
        //Checks top-left to bottom-right diagonal for a win
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            diagWin = true;
        }
        //Checks top-right to bottom-left diagonal for a win
        else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
            diagWin = true;
        }
        return diagWin;
    }

    //Checks to see if there is a tie
    private static boolean isTie(String player1, String player2) {
        boolean tie = false;
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[0].length; c++) {
                    if (board[r][c].equals("-")) {
                        return false;
                }
            }
        }
            return tie;
    }
}

