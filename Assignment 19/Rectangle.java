import java.util.*;

/*
Rectangle
Programmer: Javin Liu
Last modified on: 22.04.15
Write a program that draws a rectangle with stars, given the number of rows and columns.
*/

public class Rectangle {
   public static void main(String[] args) {
      //Variables
      int rows;
      int columns;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter rows: ");
      rows = n.nextInt();
      System.out.print("Enter columns: ");
      columns = n.nextInt();
      
      //For loop
      for (int i = 1; i <= rows; i++) {
         for (int k = 1; k <= columns; k++) {
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}