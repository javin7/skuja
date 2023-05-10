import java.util.*;

/*
Array1DOddEven
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program to input 10 integers into a 1D array, then check and output a message indicating whether or not all 10 integers were odd or even.
*/

public class Array1DOddEven {
   public static void main(String[] args) {
      //Variables
      int[] number = new int[10];
      int allEven = 0;
      int allOdd = 0;
                  
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //For loop
      for (int i = 0; i < 10; i++) {
         number[i] = n.nextInt();
         
         //Check if number is even or odd.
         if (number[i] % 2 == 0) {
            allEven++;
         } else if (number[i] % 2 == 1) {
            allOdd++;
         }
      }
      
      //Ouput if all numbers are odd or even
      if (allEven == 10) {
         System.out.println("All numbers are even.");
      } else if (allOdd == 10) {
         System.out.println("All numbers are odd.");
      } else {
         System.out.println("All the numbers are not odd or even.");
      }
      
   }
}