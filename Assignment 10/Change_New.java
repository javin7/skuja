import java.util.*;

/*
Change
Programmer: Javin Liu
Last modified on: 22.0422
Converts cents to change
*/

public class Change_New {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   System.out.print("Enter the amount (in dollars
   double dollars = n.nextDouble();
   
   
   int toonies = (int)(dollars / 2);
   int loonies = (int)((dollars % 2) / 1);
   int quarters = (int)(((dollars % 2)%1) / 0.25);
   int dimes = (int)((((dollars % 2)%1) % 0.25) / 0.10);
   int nickels = (int)(((((dollars % 2)%1) % 0.25) % 0.10) / 0.05); 
   int leftover = (int)((((((dollars % 2)%1) % 0.25) % 0.10) % 0.05)/0.01) ; 

   
   System.out.println("The minimum number of coins:");
   System.out.printf("\tToonies: %d%n",toonies);
   System.out.printf("\tLoonies: %d%n",loonies);
   System.out.printf("\tQuarters: %d%n",quarters);
   System.out.printf("\tDimes: %d%n",dimes);
   System.out.printf("\tNickels: %d%n",nickels);
   System.out.printf("\tPennies: %d%n",leftover);
   
   }
}