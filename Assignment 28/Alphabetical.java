import java.util.*;

/*
Alphabetical
Programmer: Javin Liu
Last modified on: 22.04.30
Ask the user for two strings and tell them whether the first is alphabetically first, last or equal. (method: compareTo)
*/

public class Alphabetical {
   public static void main(String[] args) {
      //Variables
      String input1;
      String input2;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter your 1st string: ");
      input1 = n.nextLine();
      System.out.print("Enter your 2nd string: ");
      input2 = n.nextLine();
      
      //Output if string 1 is alphabetically first, last or equal to string 2
      if (input1.compareTo(input2) == 0) {
         System.out.println("The 1st string is alphabetically equal than the 2nd string");
      } else if (input1.compareTo(input2) > 0)  {
         System.out.println("The 1st string is alphabetically greater than the 2nd string");
      } else {
         System.out.println("The 1st string is alphabetically less than the 2nd string");
      
      }
   }
}