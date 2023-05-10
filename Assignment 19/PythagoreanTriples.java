import java.util.*;

/*
PythagoreanTriples
Programmer: Javin Liu
Last modified on: 22.04.20
Calculates Pythagorean triples below entered value
*/

public class PythagoreanTriples {
   public static void main(String[] args) {
      //Variables
      int number;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      number = n.nextInt();
      
      //For loop to calculate triple
      for (int c = 3; c <= number; c++) {
         for (int b = 2; b < c; b++) {   
            for (int a = 1; a <= b; a++) { 
               if ((a*a) + (b*b) == c*c) { 
                  System.out.printf("%d^2 + %d^2 = %d^2%n", a, b, c);
               }
            }
         }
      }
   }
}