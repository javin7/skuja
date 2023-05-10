import java.util.*;

/*
Driving
Programmer:	Javin	Liu
Last modified on:	02.09.22
Track if someone can drive legally with age input
*/

public class Driving { 

   public static void main(String[]	args)	{
      Scanner n =	new Scanner(System.in);
      int age;
      
      System.out.print("How old are you? ");
      age = n.nextInt();
            
      if (age >= 18 && age <= 75)
      {
         System.out.printf("%nYour age is %d.%nAge OK.  Have you got a driver's licence?",age);
      }
      else if (age > 75)
      {
         System.out.printf("%nYour age is %d.%nSorry you are over the legal age limit for driving.",age);
      }
      else if (age < 18)
      {
         System.out.printf("%nYour age is %d.%nToo young to drive.",age);
      }
      
   }
}