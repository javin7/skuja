
import java.util.*;

/*
Average
Programmer:	Javin	Liu
Last modified on:	02.03.22
Calculate average	of	5 grades
*/

public class Average	{ 

   public static void main(String[]	args)	{
   
      Scanner n =	new Scanner(System.in);
   
      System.out.print("Enter grade #1: ");
      int grade1 = n.nextInt();
      System.out.print("Enter grade #2: ");
      int grade2 = n.nextInt();
      System.out.print("Enter grade #3: ");
      int grade3 = n.nextInt();
      System.out.print("Enter grade #4: ");
      int grade4 = n.nextInt();
      System.out.print("Enter grade #5: ");
      int grade5 = n.nextInt();
   
      double average	= ((double)(grade1 +	grade2 +	grade3 +	grade4 +	grade5)/5);
      System.out.printf("%nYour average is: %.2f%%",average);
   }
}
