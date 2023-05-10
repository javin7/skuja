import java.util.*;

/*
Digit Sum
Programmer: Javin Liu
Last modified on: 16.02.22
Gets sum of all digits in number
*/


public class DigitSum   
{  
   public static void main(String[] args)  
   {  
   Scanner n = new Scanner(System.in); 
   
   int number = 0;
   int digit = 0;
   int sum = 0; 
    
   System.out.print("Enter the number: "); 
    
   number = n.nextInt();  
   
   int origNum = number;
      while(number > 0)  
      {  
      digit = number % 10;   
      sum = sum + digit;  
      number = number / 10;  
      }   
      
      System.out.println("\nThe number is: " + origNum);
      System.out.println("Sum of Digits: "+sum);  
   }  
}