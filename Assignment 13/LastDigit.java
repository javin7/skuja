import java.util.*;

/*
Last Digit
Programmer:	Javin	Liu
Last modified on:	02.21.22
Find last digit of number and states it in words
*/

public class LastDigit	{ 

   public static void main(String[]	args)	{
      
      //Variables
      int num;
      
      //Scanners
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.println("Enter a number: ");
      num = n.nextInt();
      
      switch (num % 10) {
         case 1:
            System.out.printf("The last digit of %d is one.", num);
            break;
         case 2:
            System.out.printf("The last digit of %d is two.", num);
            break;
         case 3:
            System.out.printf("The last digit of %d is three.", num);
            break;
         case 4:
            System.out.printf("The last digit of %d is four.", num);
            break;
         case 5:
            System.out.printf("The last digit of %d is five.", num);
            break;
         case 6:
            System.out.printf("The last digit of %d is six.", num);
            break;
         case 7:
            System.out.printf("The last digit of %d is seven.", num);
            break;
         case 8:
            System.out.printf("The last digit of %d is eight.", num);
            break;
         case 9:
            System.out.printf("The last digit of %d is nine.", num);
            break;
         case 0:
            System.out.printf("The last digit of %d is zero.", num);
            break;
      
      }
   }
}
