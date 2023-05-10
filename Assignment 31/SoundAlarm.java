import java.util.*;

/*
SoundAlarm
Programmer: Javin Liu
Last modified on: 22.04.30
Method print out user inputted count of "Alarm!"s
*/

public class SoundAlarm {
   public static void main(String[] args) {
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input on # of times to run
      System.out.print("How many times would you like it to run? ");
      int count = n.nextInt();
      
      //Check if number is greater than 1
      if (count < 1) {
         System.out.print("Enter a number greater than or equal to 1!");
      }
      else {
         //Run alarm method
         alarm(count);
      }
   }
   
   //Alarm method
   public static void alarm(int count) {
   
      //Run alarm for the count number
      for (int i = 0; i < count; i++) {
         System.out.println("Alarm!");
      }
   }
}