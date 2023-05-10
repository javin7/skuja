import java.util.Scanner; //Import java.util package

/*
Alive
Programmer: Javin Liu
Last modified on: 16.02.22
Calculate the time you have slept from birth.
*/


public class Alive {

   public static void main(String[] args){
      
      Scanner n = new Scanner(System.in);
      
      System.out.print("Enter your birthdate:\nYear: ");
      int birthYear = n.nextInt();
      System.out.print("Month: ");
      int birthMonth = n.nextInt();
      System.out.print("Day: ");
      int birthDay = n.nextInt();
      
      System.out.print("Enter today's date:\nYear: ");
      int currentYear = n.nextInt();
      System.out.print("Month: ");
      int currentMonth = n.nextInt();
      System.out.println("Day: ");
      int currentDay = n.nextInt();
      
      int daysAlive = Math.abs(currentDay - birthDay) + Math.abs(30*(currentMonth - birthMonth) + Math.abs(365*(currentYear - birthYear)));
      int sleepTime = daysAlive * 8; 
      
      System.out.print("You have been alive for " + daysAlive + " days.\n");
      System.out.print("You have slept " + sleepTime + " hours.");
             
      }
   }