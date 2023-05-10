import java.util.*;

/*
Welcome
Programmer: Javin Liu
Last modified on: 22.04.30
Method to return name and visitor number as a string
*/

public class Welcome {
   public static void main(String[] args) {
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input on name and visitor number
      System.out.print("Enter your name: ");
      String name = n.nextLine();
      System.out.print("Enter your visitor number: ");
      int visitorNum = n.nextInt();
         
      //Run WelcomeMessage method
      System.out.println(WelcomeMessage(name, visitorNum));
   }
   
   //WelcomeMessage method
   public static String WelcomeMessage(String name, int visitorNum) {
      //Return formatted string
      return String.format("Welcome %s! You are visitor number %d.", name, visitorNum);
   }
}