import java.util.*;
import java.io.*;

/*
ReverseLines
Programmer: Javin Liu
Last modified on: 22.05.30
Your program should read this first line so it knows how many lines will follow.  
It should then read  each of the remaining lines and then output them in reverse order.  (hint: use an array)
*/

public class ReverseLines {
   public static void main(String[] args) {   
      //Variables
      String file = "reverse.txt";
      String lineIn;
      int numOfLines;
            
      //Scanner
      Scanner n = new Scanner(System.in);
      
      try
      {
      //Buffered Reader
         BufferedReader in = new BufferedReader(new FileReader(file));
         lineIn = in.readLine();
         numOfLines = Integer.parseInt(lineIn);
         String[] storage = new String[numOfLines];
         
         //Store lines into an array
         for(int i = 0; i < numOfLines; i++) {
            storage[i] = in.readLine();
         }
         
         //Read lines backwards
         for(int e = (numOfLines-1); e > -1; e--) {
            System.out.println(storage[e]);
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