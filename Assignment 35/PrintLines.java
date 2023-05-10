import java.util.*;
import java.io.*;

/*
PrintLines
Programmer: Javin Liu
Last modified on: 22.05.30
Write a program that read each line in a file “line.txt”, then output them to the standard output.
*/

public class PrintLines {
   public static void main(String[] args) {   
      //Variables
      String file = "line.txt";
      String lineIn;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      try
      {
      //Buffered Reader
         BufferedReader in = new BufferedReader(new FileReader(file));
         lineIn = in.readLine();
      //Prints out lines until eof
         while (lineIn != null) {
            System.out.println(lineIn);
            lineIn = in.readLine();
         }
      //Closes file
         in.close();
      }
      catch(IOException e) //Catches exception
      {
         System.out.println(e + " Problem Reading " + file);
      }    
   }
}