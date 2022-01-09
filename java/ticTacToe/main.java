package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Grid table = new Grid();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String[][] board = table.BuildBoard();

        System.out.println("Welcome to tic tac toe!");
        int turns = 0;
        boolean countinuePlaying = true;
        while (countinuePlaying) {
            table.printBoard();
            table.play(turns);
            table.winCheak();
            System.out.println("turn:" + (turns + 1));


            turns++;
        }
    }

}
