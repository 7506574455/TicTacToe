package test;

import java.util.Random;
import java.util.Scanner;

public class TicTacUC6 {
    // variable
    static char[] board = new char[10];
     static int[] computerNum;
    static char userInput, computerInput;
    public static Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    
    public static void main(String[] args) {
        creatingBoard();
        playerChoice();
        currentBoard();
        desiredMove();
         whoPlayFirst();
    }

    
    static void creatingBoard() {                //create method for main
        for (int i = 0; i < 10; i++) {
            board[i] = ' ';
        }
    }

    
    static void playerChoice() {               //create method for choosing option
        System.out.println("choose an option x or o");
        userInput = sc.next().charAt(0);
        if (userInput == 'x') {
            computerInput = 'o';
        } else {
            computerInput = 'x';
        }
    }

    static void showBoard() {  //create a method to show empty board

        System.out.println("     |     |     ");
        System.out.println("  " + board[1] + "  | " + board[2] + "   | " + board[3] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[4] + "  | " + board[5] + "   | " + board[6] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[7] + "  | " + board[8] + "   | " + board[9] + "  ");
        System.out.println("     |     |      ");

    }

    private static void currentBoard() {     // method to show current board
        int RADIX = 10;
        System.out.println("\n");
        for (int i = 1; i < 10; i++) {
            if (board[i] != 'x' && board[i] != 'o')
                board[i] = Character.forDigit(i, RADIX);
        }
        
        showBoard();
    }

    static void userMove() {              // create method for user to move
        System.out.println("\nUser to select the number from 1to9:\n");
        int userChoice = sc.nextInt();
        currentBoard();
        //checking free space
        if (board[userChoice] == 'x' || board[userChoice] == 'o') {
            System.out.println("there is no free space");
        }
    }

    //creating a method for user move and  checking free space
    static void desiredMove() {
        System.out.println("User to select the number from 1 o 9");
        int userChoice = sc.nextInt();
        if (board[userChoice] != 'x' || board[userChoice] != 'o') {
            board[userChoice] = userInput;
        } else {
            System.out.println("there is no free space");
        }
        
        currentBoard();
        userMove();
    }

    static void whoPlayFirst() {
        System.out.println("\nMaking toss to check who play first\n\nselect the number 1 for head and 2 for tail\n ");
        int check = sc.nextInt();
        if (check == 1 || check == 2) {
            int flip = random.nextInt(2) + 1;
            if (flip == 1) {
                System.out.println("\nBy tossing Coin it shows HEAD\n");
            } else {
                System.out.println("\nBy tossing Coin it shows TAIL\n");
            }
            if (flip == check) {
                System.out.println("u won the toss then You have to start the game\n");
                desiredMove();
            } else {
                System.out.println(" You lost the toss now its computer turn first\n");
                computerMove();
            }
        } else {
            System.out.println("\nInvalid input Again\n");
           whoPlayFirst();
        }
    }
         
         static void computerMove() {        //creating  for computer move
            computerNum = new int[9];
            int  computerChoice = random.nextInt(9)+1;
            board[computerChoice]=computerInput;
            System.out.println("the computer choice "+computerChoice+"' now its your turn.");
            desiredMove();
        }
    }