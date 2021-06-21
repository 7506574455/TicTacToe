package test;

import java.util.Scanner;

public class TicTacUC3 {

    // variable
    static char[] board = new char[10];
    static char userInput,computerInput;
    public static Scanner sc = new Scanner(System.in);
    //main method
    public static void main(String[] args) {
        creatingBoard();
        userChoice();           //call playerOption method
        currentBoard();
    }
    
    static void creatingBoard() {             //creating a method for main
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
    }
    //creating method for choosing option
    static void userChoice() {
        System.out.println("choose an option x or o");
         userInput = sc.next().charAt(0);
        if (userInput == 'x') {
            computerInput='o';
        } else {
            computerInput ='x';
        }
    }
    
    static void showBoard() {       //creating a method to show empty board

        System.out.println("     |     |     ");
        System.out.println("  " + board[2] + "  | " + board[5]  + "   | " + board[9] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[3] + "  | " + board[6]  + "   | " + board[8] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[4] + "  | " + board[7]  + "   | " + board[1] + "  ");
        System.out.println("     |     |     ");

    }
                                             
    private static void currentBoard() {      //writing a method to show current board
        int RADIX = 10;
        System.out.println("\n");
        for( int i=1; i<10; i++) {
            if (board[i] !='x'&&board[i] !='o')
                board[i] = Character.forDigit(i, RADIX);
        }
        
        showBoard();      //calling show board method  here
    }
}