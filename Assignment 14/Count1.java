import java.util.*;

/*
Count1
Programmer:	Javin	Liu
Last modified on:	03.20.22
Counts from 0-50 by increment of 5
*/

public class Count1 { 

   public static void main(String[]	args)	{
   
      //Variables
      int num = 0;
   
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //While loop
      while (num <= 50){
         System.out.println(num);
         num = num + 5; //Increment by 5
      }
      
   }
}