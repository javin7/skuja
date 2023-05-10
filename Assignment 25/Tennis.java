import java.util.*;

/*
Tennis
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program to input 10 integers into a 1D array, then check and output a message indicating whether or not all 10 integers were odd or even.
*/

public class Tennis {
   public static void main(String[] args) {
      //Variables
      int[] playerOne = new int[5];
      int[] playerTwo = new int[5];
      int playerTwoWins = 0;
      int playerOneWins = 0;
            
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get player 1 scores
      System.out.println("Enter scores of player 1: ");
      for (int i = 0; i < 5; i++) {
         System.out.printf("Score %d: ", i + 1);
         playerOne[i] = n.nextInt();
      }
      
      //Get player 2 scores
      System.out.println("\nEnter scores of player 2: ");
      for (int i = 0; i < 5; i++) {
         System.out.printf("Score %d: ", i + 1);
         playerTwo[i] = n.nextInt();
      }
      System.out.println();
      
      for (int i = 0; i < 5; i++) {
         if (playerTwo[i] >= 6) { 
            playerTwoWins++;
         }
         else if (playerOne[i] >= 6) {
            playerOneWins++;
         }
      }
      System.out.printf("Player two won %d sets%n", playerTwoWins);
      
      
      if (playerTwoWins > playerOneWins) {
         System.out.println("Player two won the game");
      }
      else {
         System.out.println("Player one won the game");      
      }
               
         
   }
}