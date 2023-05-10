import java.util.*;

/*
OutputPrintf2
Programmer: Javin Liu
Last modified on: 22.02.22
Format number and their it squared
*/

public class OutputPrintf2 {

   public static void main(String[] args) {
      
      double number1 = 1.10;
      double number2 = 1.11;
      double number3 = 1.12;
      double number4 = 1.13;
      double number5 = 1.14;
      double number6 = 1.15;
      
      System.out.println("Number\t\t Square");
      System.out.printf("%.2f\t\t\t%.5f%n",number1, Math.pow(number1,2));
      System.out.printf("%.2f\t\t\t%.5f%n",number2, Math.pow(number2,2));
      System.out.printf("%.2f\t\t\t%.5f%n",number3, Math.pow(number3,2));
      System.out.printf("%.2f\t\t\t%.5f%n",number4, Math.pow(number4,2));
      System.out.printf("%.2f\t\t\t%.5f%n",number5, Math.pow(number5,2));
      System.out.printf("%.2f\t\t\t%.5f%n",number6, Math.pow(number6,2));
   }
}