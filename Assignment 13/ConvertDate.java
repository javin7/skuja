import java.util.*;

/*
ConvertDate
Programmer:	Javin	Liu
Last modified on:	02.11.22
Turn digits of date to the date one might print on a cheque
*/

public class ConvertDate { 

   public static void main(String[]	args)	{
      
      //Variables
      int year;
      int month;
      int day;
      
      //Scanner
      Scanner n =	new Scanner(System.in);
      
      //Get user input
      System.out.print("Year: ");
      year = n.nextInt();
      System.out.print("Month: ");
      month = n.nextInt();
      System.out.print("Day: ");
      day = n.nextInt();
      
      //Display date with month as a word
      switch (month) {
         case 1:
            //January
            System.out.printf("%nJanuary %d, %d",day,year);
            break;
         case 2:
            //Febuary
            System.out.printf("%nFebuary %d, %d",day,year);
            break;
         case 3:
            //March
            System.out.printf("%nMarch %d, %d",day,year);
            break;
         case 4:
            //April
            System.out.printf("%nApril %d, %d",day,year);
            break;
         case 5:
            //May
            System.out.printf("%nMay %d, %d",day,year);
            break;
         case 6:
            //June
            System.out.printf("%nJune %d, %d",day,year);
            break;
         case 7:
            //July
            System.out.printf("%nJuly %d, %d",day,year);
            break;
         case 8:
            //August
            System.out.printf("%nAugust %d, %d",day,year);
            break;
         case 9:
            //September
            System.out.printf("%nSeptember %d, %d",day,year);
            break;
         case 10:
            //October
            System.out.printf("%nOctober %d, %d",day,year);
            break;
         case 11:
            //November
            System.out.printf("%nNovember %d, %d",day,year);
            break;
         case 12:
            //December
            System.out.printf("%nDecember %d, %d",day,year);
            break;
         default:
            System.out.printf("%nEnter a valid month");
      }
   }
}