import java.util.*;

/*
CountInt1
Programmer: Javin Liu
Last modified on: 22.03.22
Using do… while loop, write a program that let users to continuously enter integers.  
The user will enter ‘-1’ to indicate the end.  The program will then output the number of integers that were entered.  
This count should not include the exit value, ‘-1’.
*/

public class CountInt1 {

   public static void main(String[] args) {
      //Variables
      int numbers = 0;
      int input;
   
      //Scanner   
      Scanner n = new Scanner(System.in);
      
      System.out.println("Enter numbers. Enter -1 to end.");
      
      //Do while loop
      do {
         input = n.nextInt();
         
         //Check if input is positve
         if (input != -1) {
            numbers++;
         }
         
      } while (input != -1);
      
      //Output amount of numbers entered
      System.out.printf("The amount of numbers entered is %d", numbers);
   }
}