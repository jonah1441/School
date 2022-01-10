package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Grid table = new Grid();

        Scanner scanner = new Scanner(System.in);
        String[][] board = table.BuildBoard();

        System.out.println("Welcome to tic tac toe!");
        int turns = 0;
        boolean randomCheck = true;
        boolean countinuePlaying = true;

        String playGame = "";

        while (countinuePlaying) {

            System.out.println("Would you like to play a game of tic tac toe?" + " Y/N");
            playGame = scanner.nextLine();
            if (playGame.equalsIgnoreCase("y")) {

                System.out.println("would you like to play a (C)omputer or a (P)layer?");
                playGame = scanner.nextLine();

                boolean game = true;

                if (playGame.equalsIgnoreCase("c")) {
                    while (game) {
                        table.printBoard();
                        table.playPlayer(turns);// player is x
                        game = table.winCheck(turns);
                        System.out.println("turn:" + (turns + 1));
                        turns++;

                        if (!game)
                            break;

                        // TODO: Computer plays here
                        // computer is O
                        int x, y;
                        do {
                            x = Random(0, 2);
                            y = Random(0, 2);
                        } while (board[x][y].equals("X") || board[x][y].equals("O"));

                        System.out.println("computer played on number "+ board[x][y]);
                        board[x][y] = "O";

                        game = table.winCheck(turns);
                        System.out.println("turn:" + (turns + 1));
                        turns++;
                    }
                }

                if (playGame.equalsIgnoreCase("p")) {
                    while (game) {
                        table.printBoard();
                        table.playPlayer(turns);
                        game = table.winCheck(turns);
                        System.out.println("turn:" + (turns + 1));
                        turns++;

                    }
                }
            }
            if (playGame.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
/**
 * defines a random number
 */
    public static int Random(int min, int max) {
        return (int) Math.floor((Math.random() * (max - min)) + min + 1);
    }
}
