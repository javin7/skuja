import java.util.*;

/*
TimeTable
Programmer: Javin Liu
Last modified on: 22.04.15
Write a program that reads a positive integer n and then prints an “n-times table” containing values up to n X n.
*/


public class TimeTable {
   public static void main(String[] args) {
      //Variables
      int maxNumber;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter value of n for b-times table: ");
      maxNumber = n.nextInt();
      
      //For loop
      for (int i = 1; i <= maxNumber; i++) {
         System.out.printf("%d x %d = %d%n", maxNumber,i,maxNumber*i);
      }
   }
}