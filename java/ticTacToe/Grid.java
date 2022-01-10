package com.company;

import java.util.Scanner;


/**
 * grid defines the table
 */
public class Grid {
    Scanner scanner = new Scanner(System.in);

    String[][] board = new String[3][3];
    int x = 1;

    public String[][] BuildBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "" + x;
                x++;
            }
        }

        return board;

    }

    /**
     * prints the tic tac toe board
     */
    public void printBoard() {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("--" + "+" + "---" + "+" + "--");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("--" + "+" + "---" + "+" + "--");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

    }
    /**
     *defines the plays a player can play
     */
    public void playPlayer(int turns) {

        String play = "";
        System.out.println("It's player " + player(turns) + "'s" + " turn."+ " Where you going to play?");
        play = scanner.nextLine();
        switch (play) {// if this
            case "1":
                if (board[0][0].equals("X") || board[0][0].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[0][0] = player(turns);
                }
                break;
            case "2":
                if (board[0][1].equals("X") || board[0][1].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[0][1] = player(turns);
                }
                break;
            case "3":
                if (board[0][2].equals("X") || board[0][2].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[0][2] = player(turns);
                }
                break;
            case "4":
                if (board[1][0].equals("X") || board[1][0].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[1][0] = player(turns);
                }
                break;
            case "5":
                if (board[1][1].equals("X") || board[1][1].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[1][1] = player(turns);
                }
                break;
            case "6":
                if (board[1][2].equals("X") || board[1][2].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[1][2] = player(turns);
                }
                break;
            case "7":
                if (board[2][0].equals("X") || board[2][0].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[2][0] = player(turns);
                }
                break;
            case "8":
                if (board[2][1].equals("X") || board[2][1].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[2][1] = player(turns);
                }
                break;
            case "9":
                if (board[2][2].equals("X") || board[2][2].equals("O")) {
                    playPlayer(turns);
                } else {
                    board[2][2] = player(turns);
                }
                break;

        }

    }

    /**
     * returns the  players turn based on turns
     */
    public String player(int turns) {

        if ((turns - 1) % 2 == 0) {
            return "O";
        } else {
            return "X";
        }
    }
    /**
     *Checks if someone has won
     */
    public boolean winCheck(int turns) {
        String row = "";
        for (int i = 0; i < 9; i++) {

            switch (i) {
                case 1:
                    row = board[0][0] + board[0][1] + board[0][2]; //first row
                    break;
                case 2:
                    row = board[1][0] + board[1][1] + board[1][2]; //second row
                    break;
                case 3:
                    row = board[2][0] + board[2][1] + board[2][2]; //third row
                    break;
                case 4:
                    row = board[0][0] + board[1][0] + board[2][0]; //first column
                    break;
                case 5:
                    row = board[0][1] + board[1][1] + board[2][1]; //second column
                    break;
                case 6:
                    row = board[0][2] + board[1][2] + board[2][2]; //third column
                    break;
                case 7:
                    row = board[0][0] + board[1][1] + board[2][2]; //diagonal [1;5;9]
                    break;
                case 8:
                    row = board[0][2] + board[1][1] + board[2][0]; //diagonal [3;5;7]
                    break;


            }

            if (turns == 8){
                System.out.println("its a draw");
                return false;

            }
            if (row.equals("XXX")) {
                System.out.println("player X has won");
                return false;
            }
            if (row.equals("OOO")) {
                System.out.println("player O has won");
                return false;
            }


        }
        return true;

    }

}
