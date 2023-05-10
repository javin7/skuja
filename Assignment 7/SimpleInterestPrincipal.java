import java.util.*;

/*
SimpleInterestPrincipal
Programmer: Javin Liu
Last modified on: 26.02.22
Calculates principal amount with simple interest
*/

public class SimpleInterestPrincipal {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   System.out.print("Desired amount: $");
   double amount = n.nextDouble();
   System.out.print("Number of years: ");
   double years = n.nextDouble();
   System.out.print("Interest rate (%): ");
   double interestRate = n.nextDouble();
   
   
   double principal = amount / (1 + (years * interestRate/100));
   
   System.out.printf("\nThe principal amount needed is $%,.2f", principal);
   
   }
}