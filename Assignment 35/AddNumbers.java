import java.util.*;
import java.io.*;

/*
AddNumbers
Programmer: Javin Liu
Last modified on: 22.05.30
Write a program that reads the number on each line in a file “numbers.txt”, then outputs the sum to the standard output.
*/

public class AddNumbers {
   public static void main(String[] args) {   
      //Variables
      String file = "numbers.txt";
      String lineIn;
      int sum = 0;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      try
      {
      //Buffered Reader
         BufferedReader in = new BufferedReader(new FileReader(file));
         lineIn = in.readLine();
         //Prints out lines until eof
         while (lineIn != null) {
            sum += Integer.parseInt(lineIn); //Adds to sum & parse string to int
            lineIn = in.readLine();
         }
         //Prints out sum
         System.out.print(sum);
         //Closes file
         in.close();
      }
      catch(IOException e) //Catches exception
      {
         System.out.println(e + " Problem Reading " + file);
      }    
   }
}