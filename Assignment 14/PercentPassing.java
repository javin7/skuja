import java.util.*;

/*
Guess
Programmer:	Javin	Liu
Last modified on:	03.20.22
Guess number between 1-20
*/

public class PercentPassing {

   public static void main(String[] args){
      
      //Variables
      int pass = 0;
      int fail = 0;
      int grades = 0;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      System.out.println("Enter students grades as a percentage. Enter a negative number to cancel");
      
      //While loop
      while (grades >= 0) {
         //Get grade
         System.out.println("Please enter a students grade");
         grades = n.nextInt();
         
         //Check if grade is above or equal to 70
         if (grades >= 70)
         {
            pass++;
         } else 
         {
            fail++;
         }
         
      } //while loop for age guessing
      
      System.out.printf("Passing students: %d \nFailing students: %d", pass, fail);
     
   }
}