import java.util.*;

/*
TimeConversion
Programmer: Javin Liu
Last modified on: 22.02.22
Converts minutes to time
*/

public class TimeConversion {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   System.out.println("Enter minutes: ");
   int time = n.nextInt();
   
   int hours = time / 60;
   int minutes = time % 60;
   System.out.printf("%d:%02d",hours,minutes);
   
   }
}