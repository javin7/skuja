import java.util.*;

/*
CalculateSum
Programmer: Javin Liu
Last modified on: 22.04.30
Method to return sum of integers within a range
*/

public class CalculateSum {
   public static void main(String[] args) {   
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input on name and visitor number
      System.out.print("Enter your min: ");
      int min = n.nextInt();
      System.out.print("Enter your max: ");
      int max = n.nextInt();
      
      //Print out WelcomeMessage method
      System.out.println(sumRange(min,max));      
   }
   
   //WelcomeMessage method
   public static int sumRange (int min, int max) {
      //Counter variable
      int count = 0;   
   
      //Return 0 if max is less than min
      if (max < min) {
         System.out.println("The max has to be greater than min.");
         return 0;
      }
      else {
      //Return sum of integers in range
         for (int i = min; i <= max; i++) {
            count += i;
         }
         return count;
      }
   }
}