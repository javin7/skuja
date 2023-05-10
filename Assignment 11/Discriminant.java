import java.util.*;

/*
Discriminant
Programmer:	Javin	Liu
Last modified on:	02.08.22
Check roots of quadratic
*/

public class Discriminant { 

   public static void main(String[]	args)	{
      Scanner n =	new Scanner(System.in);
      
      double a; 
      double b;
      double c;
      
      System.out.print("Enter value of a: ");
      a = n.nextDouble();
      System.out.print("Enter value of b: ");
      b = n.nextDouble();
      System.out.print("Enter value of c: ");
      c = n.nextDouble();
      
      
      if((Math.pow(b,2)-4*a*c) < 0)
      {
         System.out.print("\nNo roots");
      } 
      else if((Math.pow(b,2)-4*a*c) == 0)
      {
         System.out.print("\nOne root");
      }
      else
      {
         System.out.print("\nTwo roots");
      }
   }
}