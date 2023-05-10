import java.util.*;

/*
Array2DOddEven
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program to allow the user to input 9 integers into a 3X3 square array and then identify 
all the rows and columns (by their indices) with all 3 integers being odd or even.
*/

public class Array2DOddEven {
   public static void main(String[] args) {
      //Variables
      final int ROW_SIZE = 3;
      final int COLUMN_SIZE = 3;
      int[][] number = new int[ROW_SIZE][COLUMN_SIZE];
      int allEven = 0;
      int allOdd = 0;
                  
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //For loop
      for (int row = 0; row < 3; row++) {
         for (int column = 0; column < 3; column++) {
            System.out.printf("Enter number: 4");
            number[row][column] = n.nextInt();
         }
      }
      
      for (int row = 0; row < 3; row++){
         for (int column = 0; column < 3; column++){
            System.out.printf("%4d", number[row][column]);//Prints array in a grid
         }     
         System.out.println();
      }
      
      for (int row = 0; row < 3; row++){
         for (int column = 0; column < 3; column++){
            if (number[row][column] % 2 == 0){
               System.out.print("Even ");
            } else {
               System.out.print("Odd ");
            }
         }   
         System.out.println(); //New line
      }
      
   }
}