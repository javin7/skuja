import java.util.*;

/*
Age
Programmer:	Javin	Liu
Last modified on:	03.20.22
Guess age
*/

public class Age { 

   public static void main(String[]	args)	{
   
      //Variables
      int guess;
   
      //Scanner
      Scanner n =	new Scanner(System.in);
      guess = n.nextInt();
      
      //While loop
      while(guess != 16)
      {
         System.out.println("Wrong, guess again!"); //If wrong
         guess = n.nextInt();
      }
      System.out.println("You are right!"); //If right
   }
}