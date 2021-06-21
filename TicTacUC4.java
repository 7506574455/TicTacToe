package test;

import java.util.Scanner;

public class TicTacUC4 {
    //constant variable
    static char[] board = new char[10];
    static char userInput, computerInput;
    public static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        creatingBoard();       //calling method
    
        userInput();           //calling playerOption method
        currentBoard();
        userMove();                 //calling player move method
    }

    //creating a method for main
    static void creatingBoard() {
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
    }

   static void userInput() {                  //creating method for choosing option
        System.out.println("choose an option x or o");
        userInput = sc.next().charAt(0);
        if (userInput == 'x') {
            computerInput = 'o';
        } else {
            computerInput = 'x';
        }
    }

    static void showBoard() {             //creating a method to show empty board

        System.out.println("     |     |     ");
        System.out.println("  " + board[2] + "  | " + board[5] + "   | " + board[9] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[3] + "  | " + board[6] + "   | " + board[8] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[4] + "  | " + board[7] + "   | " + board[1] + "  ");
        System.out.println("     |     |      ");

    }

    private static void currentBoard() {                      //writing a method to show current board
        int RADIX = 10;
        System.out.println("\n");
        for (int i = 1; i < 10; i++) {
            if (board[i] != 'x' && board[i] != 'o')
                board[i] = Character.forDigit(i, RADIX);
        }
        
        showBoard();
    }

    static void userMove() {                  // creating method for user to move
        System.out.println("User to select the index from 1to9");
        int userChoice = sc.nextInt();
        if (board[userChoice] != 'x' && board[userChoice] != 'o') {
            board[userChoice] = userInput;
        } else {
            System.out.println("there is no free space");
        }
       
        currentBoard();
    }
}