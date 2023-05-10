import java.util.*;

/*
Sum
Programmer: Javin Liu
Last modified on: 22.03.22
Using do… while loop, write a program that let users to continuously enter positive numbers.  
The user will enter a negative number to indicate the end.  
The program will then output the sum of the positive numbers.
*/

public class Sum {

   public static void main(String[] args) {
      //Variables
      int numbers = 0;
      int input;
   
      //Scanner   
      Scanner n = new Scanner(System.in);
      
      System.out.println("Enter numbers. Negative number to end.");
      
      //Do while loop
      do {
         input = n.nextInt();
         
         //Check if input isn't -1
         if (input >= 0) {
            numbers += input;
         }
         
      } while (input >= 0);
      
      //Ouput sum of positive numbers
      System.out.printf("The sum of the positive numbers is %d", numbers);
   }
}