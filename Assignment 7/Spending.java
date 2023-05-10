import java.util.*;

/*
Spending
Programmer: Javin Liu
Last modified on: 22.02.22
Takes money spent on 4 categories and calculates how much percentage that takes up of your spending
*/

public class Spending {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   System.out.print("Enter the amount spent last month on the following items: \n\nFood: $");
   double food = n.nextDouble();
   System.out.print("Clothing: $");
   double clothing = n.nextDouble();
   System.out.print("Entertainment: $");
   double entertainment = n.nextDouble();
   System.out.print("Rent: $");
   double rent = n.nextDouble();
   
   double totalSpent = food + clothing + entertainment + rent;
   
   System.out.printf("%nCategory%15s", "Budget");
   System.out.printf("%nFood%18.2f%s", food/totalSpent*100,"%");
   System.out.printf("%nClothing%14.2f%s", clothing/totalSpent*100,"%");
   System.out.printf("%nEntertainment%9.2f%s", entertainment/totalSpent*100,"%");
   System.out.printf("%nRent%18.2f%s", rent/totalSpent*100,"%");
   }
}