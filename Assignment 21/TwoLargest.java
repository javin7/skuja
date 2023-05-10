import java.util.*;

/*
TwoLargest
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that creates an array of size 10, and fills it with random numbers.  
It then traverses and writes out the two largest elements in the array.
*/

public class TwoLargest {
   public static void main(String[] args) {
      //Variables
      int[] number = new int[10];
      int largest = 0;
      int largest2 = 0;
                  
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Random
      Random rand = new Random();
      
      //For loop
      for (int i = 0; i < 10; i++) {
         number[i] = rand.nextInt(100);
         
         //Calculate largest number
         if (number[i] > largest) {
            largest = number[i];
         }
         
         //Calculate second largest number
         if (number[i] > largest2 && number[i] < largest) {
            largest2 = number[i];
         }
      }    
      //Output array, largest, and second largest
      System.out.println(Arrays.toString(number));
      System.out.printf("%n%d is the largest. %n", largest);
      System.out.printf("%d is the second largest.", largest2); 
   }
}