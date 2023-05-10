import java.util.Scanner; //Import java.util package

/*
Pizza Cost
Programmer: Javin Liu
Last modified on: 16.02.22
Write a program that prompts the employee for the number burgers, fries, and sodas and then displays the totals, the HST (13%), and the final cost.
Modify the program to prompt the employee for the amount tendered and then display the change due.
*/


public class fastFood {

   public static void main(String[] args){
      
      Scanner n = new Scanner(System.in);
      
         System.out.print("Enter number of burgers: ");
         int numOfBurgers = n.nextInt();
         System.out.print("Enter number of fries: ");
         int numOfFries = n.nextInt();
         System.out.print("Enter number of sodas: ");
         int numOfSodas = n.nextInt();
         
         double total = (numOfBurgers * 1.69 + numOfFries * 1.09 + numOfSodas * 0.99);
         double tax = (total * 0.13);
         double finalTotal = tax + total;
         
         System.out.println("The total cost of items is: $" + total);
         System.out.println("The tax is: $" + tax);
         System.out.println("The final total is: $" + finalTotal);
         
         System.out.println("\nHow much change tendered: $");
         double tendered = n.nextDouble();
         double change = tendered - finalTotal;
         System.out.print("The change is: $" + change);
      
      }
   }