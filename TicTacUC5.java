package test;

import java.util.Scanner;

public class TicTacUC5 {
    //constant variable
    static char[] board = new char[10];
    static char player, computer;
    public static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        //calling method here
        creatingBoard();
        playerChoice();
        currentBoard();
        userMove();
        desiredMove();
    }

    //creating a method for main
    static void creatingBoard() {
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
    }

    //creating method for choosing option
    static void playerChoice() {
        System.out.println("choose an option x or o");
        player = sc.next().charAt(0);
        if (player == 'x') {
            computer = 'o';
        } else {
            computer = 'x';
        }
    }

    //creating a method to show empty board
    static void showBoard() {

        System.out.println("     |     |     ");
        System.out.println("  " + board[2] + "  | " + board[5] + "   | " + board[9] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[3] + "  | " + board[6] + "   | " + board[8] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[4] + "  | " + board[7] + "   | " + board[1] + "  ");
        System.out.println("     |     |      ");

    }

    //writing a method to show current board
    private static void currentBoard() {
        int RADIX = 10;
        System.out.println("\n");
        for (int i = 1; i < 10; i++) {
            if (board[i] != 'x' && board[i] != 'o')
                board[i] = Character.forDigit(i, RADIX);
        }
        //calling show board method  here
        showBoard();
    }

    // creating method for user to move
    static void userMove() {
        System.out.println("User to select the number from 1to9");
        int userChoice = sc.nextInt();
        //calling current board method
        currentBoard();
        //checking free space
        if (board[userChoice] == 'x' || board[userChoice] == 'o') {
            System.out.println("there is no free space");
        }
    }

    //creating a method for user move and  checking free space
    static void desiredMove() {
        System.out.println("User to select the number from 1to9");
        int userChoice = sc.nextInt();
        if (board[userChoice] != 'x' || board[userChoice] != 'o') {
            board[userChoice] = player;
        } else {
            System.out.println("there is no free space");
        }
        //calling current board
        currentBoard();
        userMove();
    }
}