import java.util.Scanner; //Import java.util package

/*
Input_2
Programmer: Javin Liu
Last modified on: 15.05.22
Takes name and prints it concatenated with "Hello" before.
*/


public class Input_2 {

   public static void main(String[] args){
      
      
      Scanner n = new Scanner(System.in);
     
     System.out.print("What's your name? ");
     String name = n.nextLine(); //Take user input
     System.out.println("Hello " + name);
     }   
}