import java.util.*;

/*
Pass
Programmer:	Javin	Liu
Last modified on:	02.10.22
Tells user if answer to math question is right or wrong
*/

public class Pass	{ 

   public static void main(String[]	args)	{
      
      //Variables
      int input;
      int num1 = rand.nextInt(100);
      int num2 = rand.nextInt(100);
      int answer = num1 + num2;
      
      //Random
      Random rand = new Random();
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //Display Question
      System.out.printf("What is %d + %d? %n", num1,num2);
      //Get user input
      input = n.nextInt();
      
      //Check if answer if correct
      if (input == (num1 + num2)) {
         System.out.print("\nYou are correct!");
      }
      else
      {
         System.out.print("\nYou are wrong!");
      }
   }
}