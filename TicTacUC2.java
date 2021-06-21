package test;

import java.util.Scanner;

/*public class TicTacUC2 {
    
       private static char[] emptyBoard;
       private static char userInput;
       private static char computerInput;
    
	   public static void main(String[] args) {
		      //show welcome message
		      System.out.println("Welcome to TicTacToeGame");
	          //calling method to intialize board    
		      uc1_Intialize();
		
		      char userInput = uc2Select_char();
		      System.out.println("Enter user Input :" + userInput);
	      System.out.println("Enter Computer Input :" + computerInput);
	
	    private static void uc1_Intialize() {
		        char[] empty_Board = new char[10];
		        for(int i = 1; i < 10; i++) {
		    	       empty_Board[i] = ' ';
		        }
	    }
	
	    //select or choose player input as x or o
	    private static char uc2Select_char() {
		        System.out.println("Select x or o");
		        Scanner input = new Scanner(System.in);
		        char userInput = input.next().charAt(0);
		        if (userInput == 'x') {
			       computerInput = 'o';
		        } else {
			       computerInput = 'x';
		        }
		return userInput;
	    }			
	    
}   */
	  

	   public class TicTacUC2 {
	       // variable
	       static char[] board = new char[10];
	       static char userInput,computerInput;
	       public static Scanner sc = new Scanner(System.in);
	       //main method
	       public static void main(String[] args) {
	           //calling method here
	           creatingBoard();
	           //calling playerOption method
	           playerChoice();
	       }
	       //creating a method for main
	       static void creatingBoard() {
	           for (int i = 0; i < 10; i++) {
	               board[i] = '-';
	           }
	       }
	       //creating method for choosing option
	       static void playerChoice() {
	           System.out.println("choose an option x or o");
	            userInput = sc.next().charAt(0);
	           if (userInput == 'x') {
	               computerInput ='o';
	           } else {
	               computerInput ='x';
	           }
	       }

	   }	   