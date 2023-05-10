import java.util.*;

/*
AgeCheck
Programmer:	Javin	Liu
Last modified on:	02.08.22
Check if user can vote
*/

public class AgeCheck	{ 

   public static void main(String[]	args)	{
      int age;
   
      Scanner n =	new Scanner(System.in);
      
      System.out.print("How old are you? ");
      age = n.nextInt();
      
      if (age >= 18)
      {
         System.out.print("\nOLD ENOUGH TO VOTE");
      }
      else
      {
         System.out.printf("%nYou can vote in %d year(s)",18-age);
      }
      
      
   }
}