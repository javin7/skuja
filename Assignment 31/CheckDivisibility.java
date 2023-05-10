import java.util.*;

/*
CheckDivisibility
Programmer: Javin Liu
Last modified on: 22.04.30
Method to check if 2 numbers are evenly divisible
*/

public class CheckDivisibility {
   public static void main(String[] args) {   
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input on name and visitor number
      System.out.print("Enter your 1st number: ");
      double num1 = n.nextInt();
      System.out.print("Enter your 2nd number: ");
      double num2 = n.nextInt();
      
      //Output if it can be evenly divisible or not using method
      if (evenlyDivisible(num1,num2)) {
         System.out.println("It is evenly divisible.");
      }
      else {
         System.out.println("It isn't evenly divisible.");
      }
        
   }
   
   //WelcomeMessage method
   public static boolean evenlyDivisible (double num1, double num2) {
   
      //Check if both numbers are 0
      if (num1 == 0 && num2 == 0) {
         return false;
      }
      //Check if evenly divisible
      else if ((num1 / num2) % 2 == 0 || (num2 / num1) % 2 == 0) {
         return true;
      }
      //If not evenly divisible
      else {
         return false;
      }
   }
}