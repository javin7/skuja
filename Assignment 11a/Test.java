import java.util.*;

/*
Test
Programmer:	Javin	Liu
Last modified on:	02.09.22
Check test score for passing, failing, over/under range.
*/

public class Test { 

   public static void main(String[]	args)	{
      Scanner n =	new Scanner(System.in);
      double mark;
      
      System.out.print("Enter a test mark: ");
      mark = n.nextDouble();
      
      if (mark > 100)
      {
         System.out.print("\nOver range");
      }
      else if (mark < 0)
      {
         System.out.print("\nUnder range");
      } 
      else
      {
         if (mark >= 50)
         {
            System.out.print("\nPassing");
         }
         else if (mark < 50)
         {
            System.out.print("\nFailing");
         }
      } 
   }
}