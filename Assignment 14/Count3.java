import java.util.*;

/*
Count1
Programmer:	Javin	Liu
Last modified on:	03.20.22
Counts from a-b based on user input
*/

public class Count3 { 

   public static void main(String[]	args)	{
   
      //Variables
      int num1;
      int num2;
   
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //Get user input
      num1 = n.nextInt();
      num2 = n.nextInt();
      
      while (num1 <= num2){
         System.out.println(num1);
         num1++;  
      }
      
   }
}