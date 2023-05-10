import java.util.*;

/*
TableOfNumbers
Programmer: Javin Liu
Last modified on: 22.04.15
Write a program that will prompt user for two numbers x & y then output a table of numbers 
with x rows and each of the rows lists number from 1 to y, separated by a space.
*/

public class TableOfNumbers {
   public static void main(String[] args) {
      //Variables
      int x;
      int y;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter x: ");
      x = n.nextInt();
      System.out.print("Enter y: ");
      y = n.nextInt();
      
      //For loop
      for (int i = 1; i <= x; i++) {
         for (int k = 1; k <= y; k++) {
            System.out.printf("%d ",k);
         }
         System.out.print("\n");
      }
   }
}