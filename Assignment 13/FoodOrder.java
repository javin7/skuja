import java.util.*;

/*
FoodOrder
Programmer:	Javin	Liu
Last modified on:	02.11.22
Generate food menu that can be picked from and then display the price
*/

public class FoodOrder { 

   public static void main(String[]	args)	{

      //Variable
      int option;
      
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //Display menu
      System.out.println("1) juice, muffin & coffee");
      System.out.println("2) cereal, toast & milk");
      System.out.println("3) egg, toast & coffee");
      System.out.println("4) banana, granola & milk");
      System.out.println("5) grapefruit, bacon, eggs & coffee");
      
      //Get user input
      System.out.print("\nEnter then number of your order: ");
      option = n.nextInt();
      
      //Find the cost of the order that the user picked
      switch(option) {
         case 1: //Option 1
            System.out.print("The cost of your breakfast is $2.50");
            break;
         case 2: //Option 2
            System.out.print("The cost of your breakfast is $2.50");
            break;
         case 3: //Option 3
            System.out.print("The cost of your breakfast is $3.00");
            break;
         case 4: //Option 4
            System.out.print("The cost of your breakfast is $3.50");
            break;
         case 5: //Option 5
            System.out.print("The cost of your breakfast is $5.00");
            break;
         default: //If number is not appropriate
            System.out.print("You did not select an appropriate number");
      }
   }
}