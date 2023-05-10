import java.util.*;

/*
FirstLast
Programmer: Javin Liu
Last modified on: 22.04.30
print out the 1st and last character of a string entered by the user. (method charAt)
*/

public class FirstLast {
   public static void main(String[] args) {
      //Variables
      String input;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter a string: ");
      input = n.nextLine();
      
      //Output first and last characters
      System.out.printf("The first character is %c and the last character %c", input.charAt(0), input.charAt(input.length() - 1)); 
   }
}