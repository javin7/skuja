import java.util.Scanner; //Import java.util package

/*
Pizza Cost
Programmer: Javin Liu
Last modified on: 15.02.22
Calculate the cost of making pizza with user inputted diameter
*/


public class PizzaCost {

   public static void main(String[] args){
      
      Scanner n = new Scanner(System.in);
      
      System.out.print("Enter the diameter (inches) of the pizza: ");
      double diameter = n.nextDouble();
      double costOfPizza = 0.75 + 1.00 + (0.05 * diameter * diameter);
     System.out.print("The cost of making that pizza is $" +  costOfPizza);
      }
}