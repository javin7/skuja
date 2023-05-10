import java.util.Scanner; //Import java.util package

/*
Input_3
Programmer: Javin Liu
Last modified on: 15.05.22
Takes input of name and age, then outputs a "So you are <Name> and you are <Age>"
*/
public class Input_3 {
   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      
      System.out.print("What's your name? ");
      String name = n.nextLine();
      System.out.print("How old are you? " );
      String age = n.nextLine();
      System.out.print("So you are " + name + " and you are " + age);
   }
}

