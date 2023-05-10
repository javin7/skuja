import java.util.*;
import java.io.*;

/*
WriteLines
Programmer: Javin Liu
Last modified on: 22.05.30
Reads from a file named input.txt and prints out sum of each group in file
*/

public class GroupTotaler {
   public static void main(String[]args){
      //File name
      String fileName = "input.txt";      
      //Lines of the groups
      String[] groupA = new String[4];
      String[] groupB = new String[9];
      String[] groupLast = new String[6];
            
      //Variables
      double sumOfA = 0, sumOfB = 0, sumOfC = 0, lastSum = 0;
      double aNum, bNum, lastNum;
      String temp;
      
      try
      { 
         //File Scanner
         Scanner fs = new Scanner(new File(fileName));      
      
         //Skips a line
         temp = fs.nextLine();
      
      //Read group A and get sum
         for (int i = 0; i < groupA.length; i++) {
            groupA[i] = fs.nextLine();
            aNum = Double.parseDouble(groupA[i]);
            sumOfA += aNum ;
         }
      
         //Skips a line
         temp = fs.nextLine();
      
         //Read group B and get sum
         for (int i = 0; i < groupB.length; i++) {
            groupB[i] = fs.nextLine();
            bNum = Double.parseDouble(groupB[i]);
            sumOfB = bNum + sumOfB;
         }
      
         //Skips two lines
         temp = fs.nextLine();
         temp = fs.nextLine();
         
         //Read group C and get sum
         for (int i = 0; i < groupLast.length; i++) {
            groupLast[i] = fs.nextLine();
            lastNum = Double.parseDouble(groupLast[i]);
            lastSum = lastNum + lastSum;
         }
        
         //Prints out sum of groups
         System.out.printf("Group A sum: %d", sumOfA);  
         System.out.printf("Group B sum: %d", sumOfB);
         System.out.printf("Group C sum: %d", sumOfC);
         System.out.printf("Group Last: %d", lastSum);  
         
         //Closes scanner
         fs.close();
      }
      catch(IOException e)
      { 
         System.out.println(e + " Problem Reading " + fileName);//catches failure
      }
      
      
   }
}