import java.util.*;

/*
Pass
Programmer:	Javin	Liu
Last modified on:	02.08.22
Tells user if answer to math question is right or wrong
*/

public class Pass	{ 

   public static void main(String[]	args)	{
   
      //Variables
      int answer;
      int num1;
      int num2;
      int operationPicker;
      int correct;
      
      
      //Obj
      Scanner n =	new Scanner(System.in);
      Random rand = new Random();
      
      //Randomize numbers
      num1 = rand.nextInt(100);
      num2 = rand.nextInt(100);
      operationPicker = rand.nextInt(4);
      
      switch (operationPicker) {
         case 1:
            //Print question and get answer
            System.out.printf("What is %d + %d?", num1, num2  );
            answer = n.nextInt();
            correct = num1 + num2;
            if (answer == correct) {
               System.out.print("\nYou are correct!");
            }
            else
            {
               System.out.print("\nYou are wrong!");
            }
            break;
         case 2:
            //Print question and get answer
            System.out.printf("What is %d - %d?", num1, num2);
            answer = n.nextInt();
            correct = num1 - num2;
            if (answer == correct) {
               System.out.print("\nYou are correct!");
            }
            else
            {
               System.out.print("\nYou are wrong!");
            }
            break;
         case 3:
            //Print question and get answer
            System.out.printf("What is %d * %d?", num1, num2);
            answer = n.nextInt();
            correct = num1 * num2;
            if (answer == correct) {
               System.out.print("\nYou are correct!");
            }
            else
            {
               System.out.print("\nYou are wrong!");
            }
            break;
         case 4:
            //Print question and get answer
            System.out.printf("What is %d / %d?");
            answer = n.nextInt();
            correct = num1 / num2;
            if (answer == correct) {
               System.out.print("\nYou are correct!");
            }
            else
            {
               System.out.print("\nYou are wrong!");
            }
            break;
      }
   }
}