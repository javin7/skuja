import java.util.*;

/*
Delivery
Programmer:	Javin	Liu
Last modified on:	02.10.22
Caclulate cost of package for delivery
*/

public class Delivery { 

   public static void main(String[]	args)	{
   
      //Variables
      double weight;
      double length;
      double width;
      double height;
      double dimensions;
         
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      
      //Get weight and dimensions of package
      System.out.print("What is the weight of the package (kg): ");
      weight = n.nextDouble();
      System.out.print("What is the length of the package (cm): ");
      length = n.nextDouble();
      System.out.print("What is the width of the package (cm): ");
      width = n.nextDouble();
      System.out.print("What is the height of the package (cm): ");
      height = n.nextDouble();
      
      //Dimension calculation
      dimensions = length * width * height;
      
      //If block to check if it is too heavy or large
      if (weight > 27) {
         System.out.print("Too heavy");
      } else if (dimensions > 100000){
         System.out.print("Too large");
      } else {
         //Nested if statement for cost
         if (weight <= 5) {
            System.out.printf("The total cost is $%.2f", weight * 3.0);
         } else if (weight > 5 && weight <= 12) {
            System.out.printf("The total cost is $%.2f", weight * 3.5);
         } else if (weight > 12 && weight <= 20) {
            System.out.printf("The total cost is $%.2f", weight * 4.0);
         } else {
            System.out.printf("The total cost is $%.2f", weight * 4.5);
         }
      }
      
   }
}