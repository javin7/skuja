import java.util.*;

/*
Backward2
Programmer: Javin Liu
Last modified on: 22.04.15
Modify the program so that before you start the count you can 
input a number between 100 and 50 so that the program will 
stop when the count would be less then the number input.  
*/

public class Backward2 {
   public static void main(String[] args) {
      //Variables
      int number;
            
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.println("Enter a number between 100 to 50.");
      number = n.nextInt();
            
      //For loop
      for (int i = 100; i >= number; i -= 5) {
         System.out.println(i);
      }
   }
}