import java.util.*;

/*
SameSum
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that creates two arrays of size 10 list1 and list2.  The program would fill list1 with user input, 
and put values into list2 so that the sum of corresponding cells in list1 and list2 is 25.
*/

public class SameSum {
   public static void main(String[] args) {
      //Variables
      
      final int ARRAY_SIZE = 10;
      int[] list1 = new int[ARRAY_SIZE];
      int[] list2 = new int[ARRAY_SIZE];
                  
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //For loop
      for (int i = 0; i < 10; i++) {
         System.out.printf("Enter number %d: ", i + 1);
         list1[i] = n.nextInt();
         
         //Put values into list2
         list2[i] = 25 - list1[i];
      }
      
      System.out.println(Arrays.toString(list2));
   }
}