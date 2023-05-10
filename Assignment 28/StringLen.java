import java.util.*;

/*
StringLen
Programmer: Javin Liu
Last modified on: 22.04.30
Print out the length of a string entered by the user. (method: length)
*/

public class StringLen {
   public static void main(String[] args) {
      //Variables
      String input;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter a string: ")
      input = n.nextLine();
      
      //Output absolute value of number
      System.out.print("The length of that string is ");
      System.out.println(input.length());   
   }
}