import java.util.*;

/*
Unicode
Programmer: Javin Liu
Last modified on: 22.03.22
Write a do...while loop that displays a Unicode table for the characters from 1..212
*/

public class Unicode {

   public static void main(String[] args) {
      //Variables
      int number = 0;
   
      //Scanner   
      Scanner n = new Scanner(System.in);
      
      System.out.println("Unicode  | Character");
      
      //Do...while loop
      do {
         
         //Displays unicode and char
         System.out.printf("%4d  %8c%n", number, (char) number);
         
         number++;
      } while (number <= 212);
   }
}