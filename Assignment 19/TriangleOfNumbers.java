import java.util.*;

/*
TableOfNumbers
Programmer: Javin Liu
Last modified on: 22.04.15
Use for loops to create a triangle of numbers
*/

public class TriangleOfNumbers {
   public static void main(String[] args) {
      //Variables
      int x;
      int y;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //For loop
      for (int i = 1; i <= 5; i++) {
         for (int k = 1; k <= i; k++) {
            System.out.printf("%d ",k);
         }
         System.out.print("\n");
      }
   }
}