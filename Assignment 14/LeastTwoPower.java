import java.util.*;

/*
LeastTwoPower
Programmer:	Javin	Liu
Last modified on:	03.20.22
Finds the lowest power on 2 to be greater or equal to the user inputted number
*/

public class LeastTwoPower { 

   public static void main(String[]	args)	{
   
      //Variables
      int num;
      int comp;
      int count = 1;
      
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //Get user input
      num = n.nextInt();
      
      comp = (int) Math.pow(2, count);
      
      //While loop
      while (comp < num){
         count++;  
         //Calculate the powers
         comp = (int) Math.pow(2,count);
      }
      //Output
      System.out.printf("%d = 2 to the power of %d is the smallest power of 2 that is equal or greater than %d",comp,count,num);
      
   }
}