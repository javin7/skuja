import java.util.*;

/*
Chart
Programmer: Javin Liu
Last modified on: 22.04.15
Develop a chart, with titles, containing the squares and cubes of the natural numbers from 5 to 40. 
*/

public class Chart {
   public static void main(String[] args) {
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Title
      System.out.println("Number | Cube  | Square");
      
      //For loop
      for (int i = 5; i <= 40; i++) {
         System.out.printf("%6d | %5d |%5d%n",i,(int) Math.pow(i,3), (int) Math.pow(i,2));
      }
   }
}