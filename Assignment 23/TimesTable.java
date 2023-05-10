import java.util.*;

/*
StarTable
Programmer: Javin Liu
Last modified on: 22.04.30
Print 12 x 12 timetable
*/

public class TimesTable {  
   public static void main(String[] args) {
      //Variables
      final int ARRAY_ROW_SIZE = 13;
      final int ARRAY_COLUMN_SIZE = 13;
      int[][] table = new int[ARRAY_ROW_SIZE][ARRAY_COLUMN_SIZE];
      
      System.out.print("     ");
      //Print out column of times table
      for (int b = 1; b < ARRAY_COLUMN_SIZE; b++) {
         System.out.printf("%-5d ",b);
      }
      System.out.println();
      
      for (int i = 1; i < ARRAY_COLUMN_SIZE; i++) {
         System.out.printf("%-5d", i); //Print out the row number of times table
         for (int b = 1; b < ARRAY_ROW_SIZE; b++) {
         
            //Print out the times table 
            table[i][b] = i * b;
            System.out.printf("%-5d ",table[i][b]);
         }
         System.out.println();
      } 
   }
}