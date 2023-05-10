import java.util.*;

/*
Cost
Programmer: Javin Liu
Last modified on: 01.03.22
Calculates total cost
*/

public class Cost {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   final double HST = 1.13;
   final double BAG = 0.05;
   
   System.out.print("Enter price of item: $");
   double item = n.nextDouble();
   System.out.print("How many bags would you like? ");
   int numberOfBags = n.nextInt();
   
   System.out.printf("The total cost is %.2f", HST * (item + (numberOfBags * BAG)));
   
   
   
   }
}