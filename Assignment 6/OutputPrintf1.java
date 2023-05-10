import java.util.*;

/*
OutputPrintf1
Programmer: Javin Liu
Last modified on: 22.02.22
Format bank account
*/

public class OutputPrintf1 {

   public static void main(String[] args) {
      
      String bankAccountName1 = "Juanita";
      String bankAccountName2 = "Juan";
      
      double bankBalence1 = 2345678.99;
      double bankBalence2 = 15455.26;
      
      System.out.printf("%7s's bank account balence is $%,12.2f%n", bankAccountName1, bankBalence1);
      System.out.printf("%7s's bank account balence is $%,12.2f", bankAccountName2, bankBalence2);

   }

}