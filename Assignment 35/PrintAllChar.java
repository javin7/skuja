import java.util.*;
import java.io.*;

/*
PrintAllChar
Programmer: Javin Liu
Last modified on: 22.05.30
Write a program that reads all lines in the file “allChar.txt”, 
then prints each character on each line on separate line, excluding the spaces, ‘\n’ and ‘\r’
*/

public class PrintAllChar {
   public static void main(String[] args) {   
      //Variables
      String file = "allChar.txt";
      String lineIn;
      char splice;
            
      //Scanner
      Scanner n = new Scanner(System.in);
      
      try
      {
      //Buffered Reader
         BufferedReader in = new BufferedReader(new FileReader(file));
         lineIn = in.readLine();
         //Prints out lines until eof
         while (lineIn != null) {
            for (int i = 0; i < lineIn.length(); i++) {
               //Check if line is \n, \r, or a space
               if (lineIn.equals("\n") || lineIn.equals("\r") || lineIn.charAt(i) == (' ')) {
               }
               else {
                  System.out.println(lineIn.charAt(i));
               }
            }
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