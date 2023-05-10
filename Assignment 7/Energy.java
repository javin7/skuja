import java.util.*;

/*
Energy
Programmer: Javin Liu
Last modified on: 22.02.22
Converts mass (kg) to energy and calculates how many lightbulbs you can power
*/

public class Energy {

   public static void main(String[] args) {
   
   Scanner n = new Scanner(System.in);
   
   System.out.println("Enter the mass (kg): ");
   
   double mass = n.nextDouble();
   
   double energy = mass * Math.pow(300000000,2);
   
   System.out.printf("Energy: %,f Joules%nNumber of lightbulbs you can power: %,f",energy,energy/360000);
   
   }
}