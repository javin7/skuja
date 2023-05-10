import java.util.*;

/*
Exponent
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that ask user for a base b, and an exponent e, then print out the power b^e.
*/

public class Exponent {
   public static void main(String[] args) {
      //Variables
      int b;
      int e;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input of base and exponent
      System.out.print("Enter your base: ");
      b = n.nextInt();
      System.out.print("Enter your exponent: ");
      e = n.nextInt();
      
      //Output a base to a power
      System.out.println(Math.pow(b,e));   
   }
}