import java.util.*;

/*
CountInt1
Programmer: Javin Liu
Last modified on: 22.03.22
Adapt #4 so that the users can enter any negative numbers to indicate the end.  
Again, your count should not include the value used to exit the loop.
*/

public class CountInt2 {

   public static void main(String[] args) {
      //Variables
      int numbers = 0;
      int input;
   
      //Scanner   
      Scanner n = new Scanner(System.in);
      
      System.out.println("Enter numbers. Enter negative number to end.");
      
      //Do while loop
      do {
         input = n.nextInt();
         
         //Check if input is positve
         if (input >= 0) {
            numbers++;
         }
         
      } while (input >= 0);
      
      //Output amount of numbers entered
      System.out.printf("The amount of numbers entered is %d", numbers);
   }
}