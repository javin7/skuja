import java.util.*;

/*
Reverse
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that creates two arrays of size 10 list1 and list2.  
The program would fill list1 with user input; list2 gets the elements of list1 in reversed order.
*/

public class Reverse {
   public static void main(String[] args) {
      //Variables
      
      final int ARRAY_SIZE = 10;
      int[] list1 = new int[ARRAY_SIZE];
      int[] list2 = new int[ARRAY_SIZE];
      int count = 0;
                  
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //For loop
      for (int i = 0; i < 10; i++) {
         //Get user input
         System.out.printf("Enter number %d: ", i + 1);
         list1[i] = n.nextInt();
         
      }
      
      //Put values into list2 in reverse order of list1
      for (int i = 9; i >= 0; i--) {
         list2[i] = list1[count];
         count++;
      }
      //Output list2
      System.out.println(Arrays.toString(list2));
   }
}