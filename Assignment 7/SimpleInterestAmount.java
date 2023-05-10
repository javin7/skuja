import java.util.*;

/*
SimpleInterestAmountA
Programmer: Javin Liu
Last modified on: 22.02.22
Calculates simple interest
*/

public class SimpleInterestAmount {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   System.out.print("Principal: $");
   double principal = n.nextDouble();
   System.out.print("Number of years: ");
   double years = n.nextDouble();
   System.out.print("Interest rate (%): ");
   double interestRate = n.nextDouble();
   
   
   double amount = (principal * (1 + (years * interestRate/100)));
   
   System.out.printf("\nYour money after %.0f years is $%,.2f", years, amount);
   
   }
}