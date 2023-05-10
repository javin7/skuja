import java.util.*;

/*
AddPairs
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that outputs the sum of each pair of digits in a number entered by the user.
*/

public class AddPairs {
   public static void main(String[] args) {
      //Variables
      String input;
      int count = 0;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter numbers: ");
      input = n.nextLine();
      
      //Check if number is odd or even
      if (input.length() % 2 == 0) {
         for (int i = 0; i < input.length(); i+=2) {
            count += Integer.parseInt(input.substring(i,i+2));
         }
      } else {
         //Check if it is index of last digit
         for (int i = 0; i < input.length(); i+=2) {
            if (i == input.length() - 1) {
               count += Integer.parseInt(input.substring(i,i+1));
            } else {
               count += Integer.parseInt(input.substring(i,i+2));
            }
         }
      }
      //Output sum of numbers
      System.out.println(count);
   }
}