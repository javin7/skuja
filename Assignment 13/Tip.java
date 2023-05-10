import java.util.*;

/*
Tip
Programmer:	Javin	Liu
Last modified on:	02.21.22
Gets grade and outputs a tip based on grade
*/

public class Tip { 

   public static void main(String[]	args)	{
      
      //Variables
      char grade;
      
      //Scanners
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter your letter grade in computer science:");
      grade = n.next().charAt(0);
      
      switch (grade) {
         case 'A':
            System.out.print("\nYour doing really good, keep it up!");
            break;
         case 'B':
            System.out.print("\nYou are at a average grade, you are doing good.");
            break;
         case 'C':
            System.out.print("\nYou are a bit behind others, work harder and you will catch up!");
            break;
         case 'D':
            System.out.print("\nYou might need extra help from the teacher. You are close to failing the course.");
            break;
         case 'F':
            System.out.print("\nYou are failing. Talk to your teacher and work significantly harder.");
            break;
         }
      }
   }