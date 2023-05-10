import java.util.*;

/*
Count2
Programmer:	Javin	Liu
Last modified on:	03.20.22
Counts from 50-100 by increment of 1
*/

public class Count2 { 

   public static void main(String[]	args)	{
   
      //Variables
      int num = 50;
   
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //While loop
      while (num <= 100){
         System.out.println(num); 
         num++; //Increment by 1
      }
      
   }
}