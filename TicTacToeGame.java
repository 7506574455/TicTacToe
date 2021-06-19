package test;

public class TicTacToeGame {
    
    char[] board = new char [10];
	
			//creating method
  
   public void getBoard()
   {
	   for(int i=1; i<board.length; i++) 
	   {
		   board[i] = ' ';
	   }
   }
      
		
   public static void main(String Args[]) 
   {
	   TicTacToeGame obj=new TicTacToeGame();
		System.out.println("Welcome to Tic Tac Toe Game");
	}

}