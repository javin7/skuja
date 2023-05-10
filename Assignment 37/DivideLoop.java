import java.util.*;
import java.io.*;

/*
DivideLoop
Programmer: Javin Liu
Last modified on: 22.05.30
The program prints out the result (quotient), or an informative error message if there is a problem
Exit the loop when data entered for the numerator start with characters “q” or “Q”.
*/

public class DivideLoop {

   //Check if number is numeric
   public static boolean isNumeric(String str) { 
      try {  
         Double.parseDouble(str);  
         return true;
      } catch(NumberFormatException e){  
         return false;  
      }  
   }

   public static void main(String[] args) {       
      //Variables
      String numerator;
      String divisor;
      String ans;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get numerator   
      System.out.print("Enter the numerator: ");
      numerator = n.nextLine();
      //Get divisor
      System.out.print("Enter the divisor: ");
      divisor = n.nextLine();
      
      //Check if number is numeric
      if (numerator.charAt(0) == 'q' || numerator.charAt(0) == 'q') {
            
      } else if (!isNumeric(numerator) || !isNumeric(divisor)) { 
         System.out.println("You entered bad data.");
         System.out.println("Please try again.");
      } else {
         try {      
         //Print out numerator / divisor
            System.out.printf("%d / %d is %d", numerator, divisor, Integer.parseInt(numerator)/Integer.parseInt(divisor));
         } catch (ArithmeticException e) { //Catch exception
         
            System.out.printf("You can't divide %d by %d", numerator, divisor);
         }
      }
      
   }
}