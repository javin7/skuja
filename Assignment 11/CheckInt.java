import java.util.*;

/*
CheckInt
Programmer:	Javin	Liu
Last modified on:	02.08.22
Check integer
*/

public class CheckInt { 

   public static void main(String[]	args)	{
      Scanner n =	new Scanner(System.in);
      int checkValue;
      
      System.out.println("Enter integer: ");
      checkValue = n.nextInt();
      
      if (checkValue < 0)
      {
         System.out.printf("%n%d is negative%n", checkValue);
      }
      else
      {
         System.out.printf("%n%d is positive%n", checkValue);
      }
      
      if (checkValue % 2 == 1)
      {
         System.out.printf("%d is odd%n", checkValue);
      }
      else
      {
         System.out.printf("%d is even%n", checkValue);
      }
      
      if (checkValue % 7 == 0)
      {
         System.out.printf("%d is a multiple of 7%n", checkValue);
      }
      else
      {
         System.out.printf("%d is not a multiple of 7%n", checkValue);
      }
      
      
   }
}