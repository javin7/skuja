import java.util.*;

/*
Stages
Programmer:	Javin	Liu
Last modified on:	02.10.22
Sorts 3 numbers and check if positive whole numbers.
*/

public class SortThreeNumbers {
   public static void main(String[] args) {
      
      //Variables
      int numOne;
      int numTwo;
      int numThree;
      
      //Scanner
      Scanner n = new Scanner(System.in);

      //Get user input for the 3 numbers
      System.out.print("Enter the first number: ");
      numOne = n.nextInt();
      
      System.out.print("Enter the second number: ");
      numTwo = n.nextInt();
      
      System.out.print("Enter the third number: ");
      numThree = n.nextInt();
      
      //If statements to print out order of numbers
      if (numOne >= 0 && numTwo >= 0 && numThree >= 0){
         if (numOne > numTwo && numOne > numThree){
            System.out.println(numOne);
               if (numTwo > numThree){
                  System.out.println(numTwo);
                  System.out.println(numThree);
               } else {
                  System.out.println(numThree);
                  System.out.println(numTwo);
               }
               
         } else if (numTwo >= numOne && numTwo >= numThree) {
            System.out.println(numTwo);
               if (numOne > numThree){
                  System.out.println(numOne);
                  System.out.println(numThree);
               } else {
                  System.out.println(numThree);
                  System.out.println(numOne);
               }
         } else {
            System.out.println(numThree);
               if (numOne > numTwo){
                  System.out.println(numOne);   
                  System.out.println(numTwo);
               } else {
                  System.out.println(numTwo);
                  System.out.println(numOne);               
               }
         }
      } else {
         System.out.println("ERROR");
      }
      
   }
}