import java.util.*;

/*
RandomNum
Programmer: Javin Liu
Last modified on: 22.04.30
Write a program that will print out a random number between 0 and 100.
*/

public class RandomNum {
   public static void main(String[] args) {
      //Random object
      Random rand = new Random();
      
      //Output a random number from 0-100
      System.out.println(rand.nextInt(101));   
   }
}