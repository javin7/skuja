import java.util.*;

/*
AbsValue
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that asks user for a number, then outputs the absolute value of that number.
*/

public class AbsValue {
   public static void main(String[] args) {
      //Variables
      int number;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input of number
      System.out.print("Enter your number: ");
      number = n.nextInt();
      
      //Output absolute value of number
      System.out.println(Math.abs(number));   
   }
}