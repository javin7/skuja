import java.util.*;

/*
Backward1
Programmer: Javin Liu
Last modified on: 22.04.15
Write a program to output a backwards count by 5's from 100 down to 5. 
*/

public class Backward1 {
   public static void main(String[] args) {
   
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //For loop
      for (int i = 100; i >= 5; i -= 5) {
         System.out.println(i);
      }
   }
}