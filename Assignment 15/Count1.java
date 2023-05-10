import java.util.*;

/*
Count1
Programmer: Javin Liu
Last modified on: 22.03.22
Do..while loop that counts down from 100 to 1 by 2’s.
*/

public class Count1 {

   public static void main(String[] args) {
      //Variables
      int count = 100;
   
      //Scanner   
      Scanner n = new Scanner(System.in);
   
      //Do while loop
      do {
         //Print number
         System.out.println(count);
      
         count -= 2;
      
      } while (count > 1);
   }
}