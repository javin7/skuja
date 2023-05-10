import java.util.*;

/*
Half
Programmer: Javin Liu
Last modified on: 22.04.30
Ask the user for a string and break it in half printing the first half on one line and the last half on another. (method: substring)
*/

public class Half {
   public static void main(String[] args) {
      //Variables
      String input;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input
      System.out.print("Enter a string: ");
      input = n.nextLine();
      
      //Output string split in two
      System.out.println(input.substring(0, input.length() / 2));
      System.out.println(input.substring(input.length() / 2, input.length()));
   }
}