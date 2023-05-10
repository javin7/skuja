import java.util.*;

/*
SelfReverse
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that creates an array user inputted size 
The program would fill list1 with user input then the array gets reversed
*/

public class SelfReverse {
   public static void main(String[] args) {
      //Variables
      int[] list1;
      int count;
      int arraySize;
                  
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Array size
      System.out.print("Enter array size: ");
      arraySize = n.nextInt();
      list1 = new int[arraySize];
      
      //Get user input for array
      for (int i = 0; i < list1.length; i++) {
         System.out.printf("Enter number %d: ", i + 1);
         list1[i] = n.nextInt();
         
      }
      
      //Reverse list
      for (int i = 0; i < list1.length / 2; i++)
      {
         count = list1[i];
         list1[i] = list1[list1.length - i - 1];
         list1[list1.length - i - 1] = count;
      }
      
      //Output list
      System.out.println(Arrays.toString(list1));
   }
}