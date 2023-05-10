import java.util.Scanner; //Import java.util package

/*
Input_4
Programmer: Javin Liu
Last modified on: 15.05.22
Takes input of 2 words then outputs both words on seperate line then prints both words in the same line seperated by a line
*/

public class Input_4 {
   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      
      System.out.print("Please enter word #1: ");
      String word1 = n.nextLine();
      System.out.print("Please enter word #2: ");
      String word2 = n.nextLine();
      System.out.println(word1);
      System.out.println(word2);
      System.out.println(word1 + "\t" + word2);
   }
}  