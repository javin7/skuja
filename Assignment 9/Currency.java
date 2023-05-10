import java.util.*;

/*
Currency
Programmer: Javin Liu
Last modified on: 01.03.22
USD to CAD
*/

public class Currency {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   final double USD = 1.29;
   
   System.out.print("Enter amount of USD: $");
   double numberOfUSD = n.nextDouble();
   
   System.out.printf("The Canadian equivalent is $%.2f CAD.", numberOfUSD * USD);
   
   
   
   }
}