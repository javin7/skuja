import java.util.*;

/*
AddDigits
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that outputs the sum of each digit in a number entered by the user.
*/

public class AddDigits {
   public static void main(String[] args) {
      //Variables
      String input;
      int count = 0;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter numbers: ");
      input = n.nextLine();
      
      //Calculate sum of numbers
      for (int i = 0; i < input.length(); i++) {
         count += Integer.parseInt(input.substring(i,i+1));
      }
      
      //Output sum of numbers
      System.out.println(count);
   }
}