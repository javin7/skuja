import java.util.*;

/*
Stages
Programmer:	Javin	Liu
Last modified on:	02.10.22
Check age for group
*/

public class Stages { 

   public static void main(String[]	args)	{
   
      //Variable
      int age;
      
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //Get user input of age
      System.out.print("Enter your age: ");
      age = n.nextInt();
      
      //Check if they are adult
      if (age > 18){
         System.out.print("\nAdult");
      }
      else
      {
         //Check what group they are part of if they are not adult
         if(age <= 18 && age > 12) {
            System.out.print("\nTeen");
         } else if(age <= 12 && age > 10) {
            System.out.print("\nPreteen");
         } else if(age <= 10 && age > 5) {
            System.out.print("\nChild");
         } else {
            System.out.print("\nToddler");
         }
      }
      
   }
}