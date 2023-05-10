import java.util.*;

/*
Salary
Programmer:	Javin	Liu
Last modified on:	02.08.22
Calculate salary of salesperson
*/

public class Salary { 

   public static void main(String[]	args)	{
      Scanner n =	new Scanner(System.in);
      final double BASE_SALARY = 1000;
      double sales;
      
      System.out.println("Number of sales during the month: ");
      sales = n.nextInt();
      
      if (sales > 10 ) 
      {
         System.out.printf("The total salary for the month is $%.2f",BASE_SALARY * (1+(sales/100)));
      }
      else
      {
         System.out.printf("The total salary for the month is $1000");
      }
      
   }
}