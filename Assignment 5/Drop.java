import java.util.Scanner; //Import java.util package

/*
Average
Programmer: Javin Liu
Last modified on: 15.02.22
Takes input of t from user and inputs it into h = 100 – 4.9t^2 to caclulate height at that specific time
*/


public class Drop {

   public static void main(String[] args){
      
      Scanner n = new Scanner(System.in);
      
      System.out.print("Enter a time(s) less than 4.5 seconds: ");
      double time = n.nextDouble();
      double height = 100 - 4.9 *(Math.pow(time, 2));
      System.out.print("The height of the object at that specific time is " + height +" seconds.");
      
      }
}