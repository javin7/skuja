import java.util.*;

/*
Change
Programmer: Javin Liu
Last modified on: 22.02.22
Converts cents to change
*/

public class Change {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   System.out.print("Enter the amount (in cents): ");
   int cents = n.nextInt();
   
   
   int toonies = cents / 200;
   int loonies = (cents % 200) / 100;
   int quarters = ((cents % 200) % 100) / 25;
   int dimes = (((cents % 200) % 100) % 25) / 10;
   int nickels = ((((cents % 200) % 100) % 25) % 10) / 5; 
   int leftover = ((((cents % 200) % 100) % 25) % 10) % 5;
   
   System.out.println("The minimum number of coins:");
   System.out.printf("\tToonies: %d%n",toonies);
   System.out.printf("\tLoonies: %d%n",loonies);
   System.out.printf("\tQuarters: %d%n",quarters);
   System.out.printf("\tDimes: %d%n",dimes);
   System.out.printf("\tNickels: %d%n",nickels);
   System.out.printf("\tLeftover cents: %d%n",leftover);
   
   }
}