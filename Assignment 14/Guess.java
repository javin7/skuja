import java.util.*;

/*
Guess
Programmer:	Javin	Liu
Last modified on:	03.20.22
Guess number between 1-20
*/

public class Guess { 

   public static void main(String[]	args)	{
   
      //Variables
      int guess;
      final int ANSWER = 12;
   
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //Get user input
      guess = n.nextInt();
      
      //While loop
      while (guess != ANSWER)
      {
         if (guess > 20 || guess < 1) {
            System.out.println("Guess is out of range!"); //If out of range
            guess = n.nextInt();
         }
         else {
            System.out.println("Wrong, guess again!"); //If wrong
            guess = n.nextInt();
         }
      }
      System.out.println("You are right!"); //If right
      
   }
}