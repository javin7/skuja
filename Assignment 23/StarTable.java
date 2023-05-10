import java.util.*;

/*
StarTable
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program to input 10 integers into a 1D array, then check and output a message indicating whether or not all 10 integers were odd or even.
*/

public class StarTable {
   public static void main(String[] args) {
      //Variables
      String[][] table;
      int arrayRow;
      int arrayColumn;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input of array size
      System.out.print("Enter columns: ");
      arrayColumn = n.nextInt();
      System.out.print("Enter rows: ");
      arrayRow = n.nextInt();
      
      //Create array
      table = new String[arrayRow][arrayColumn];
      
      //Put stars into the array and print it out
      for (int i = 0; i < arrayColumn; i++) {
         for (int b = 0; b < arrayRow; b++) {
            table[i][b] = "*";
            System.out.printf("%s ",table[i][b]);
         }
         System.out.println();
      } 
   }
}