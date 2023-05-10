import java.util.Scanner; //Import java.util package

/*
Average
Programmer: Javin Liu
Last modified on: 15.02.22
Reads 3 double values and computes their average
*/


public class Average {

   public static void main(String[] args){
      
      
      Scanner n = new Scanner(System.in);
      
      System.out.print("Enter value #1: ");
      double value1 = n.nextDouble();
      System.out.print("Enter value #2: ");
      double value2 = n.nextDouble();
      System.out.print("Enter value #3: ");
      double value3 = n.nextDouble();
      
      System.out.print((value1 + value2 + value3) /3);
     }   
}