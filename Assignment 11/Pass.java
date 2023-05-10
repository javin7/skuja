import java.util.*;

/*
Pass
Programmer:	Javin	Liu
Last modified on:	02.08.22
Tells user if answer to math question is right or wrong
*/

public class Pass	{ 

   public static void main(String[]	args)	{
      int answer;
      Scanner n =	new Scanner(System.in);
      
      System.out.println("What is 2 x 2?");
      answer = n.nextInt();
      
      if (answer == 4) {
         System.out.print("\nYou are correct!");
      }
      else
      {
         System.out.print("\nYou are wrong!");
      }
      
      
      
      
   }
}