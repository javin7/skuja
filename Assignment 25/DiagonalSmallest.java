import java.util.*;

/*
DiagonalSmallest
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program to input 10 integers into a 1D array, then check and output a message indicating whether or not all 10 integers were odd or even.
*/

public class DiagonalSmallest {
   public static void main(String[] args) {
      //Variables
      int[][] numbers = new int[4][4];
      int smallest1;
      int smallest2;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      for (int i = 0; i < 4; i++) {
         for (int b = 0; b < 4; b++) {
            numbers[i][b] = n.nextInt();
         }
      }
      
      smallest1 = numbers[0][0];
      
      for (int i = 1; i < 4; i++) {
         if (numbers[i][i] < smallest1) {
            smallest1 = numbers[i][i];
         }
      }
      
      smallest2 = numbers[0][3];
      
      for (int i = 2; i >= 0; i--) {
         if (numbers[i][i] < smallest2) {
            smallest2 = numbers[i][i];
         }
      }
      
      if (smallest2 > smallest1) {
         smallest1 = smallest2;
      }
      
      System.out.printf("The smallest number in either diagonal is %d", smallest1);
   }
}