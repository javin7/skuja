import java.util.*;

/*
Height
Programmer: Javin Liu
Last modified on: 01.03.22
Output height in cm
*/

public class Height {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   final double INCH = 2.54;
   
   System.out.print("What is your height in inches? ");
   double inches = n.nextDouble();
   
   System.out.printf("Your height in cm is %.2f.", INCH * inches);
   
   }
}