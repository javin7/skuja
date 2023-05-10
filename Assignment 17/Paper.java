import java.util.*;

/*
Paper
Programmer: Javin Liu
Last modified on: 22.04.15
Suppose that a large piece of paper with an area of 1.0m2 and a thickness of 0.090 mm is cut in half and the two pieces are stacked, 
one on top of the other.  Suppose further that the process of cutting in half and stacking is repeated over and over again.  
Write a program to find both the thickness of the pile and the area of each piece after the procedure has been carried out forty times. 
*/


public class Paper {
   public static void main(String[] args) {
      //Variables
      double area = 1.0;
      double thickness = 0.090;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //For loop
      for(int i = 40; i >= 0; i--) {
         area = area / 2;
         thickness += 0.09;
      }
      
      //Print out values
      System.out.print("The area is " + area + " m^2");
      System.out.printf("%nThe thickness is %.3f mm", thickness);
   }

}