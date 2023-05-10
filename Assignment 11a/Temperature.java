import java.util.*;

/*
Temperature
Programmer:	Javin	Liu
Last modified on:	02.09.22
Print condition based on temperature
*/

public class Temperature { 

   public static void main(String[]	args)	{
      Scanner n =	new Scanner(System.in);
      int temperature;
      
      System.out.print("What is the temperature? ");
      temperature = n.nextInt();
      
      
      if (temperature < -18)
      {
         System.out.print("very cold");
      }
      else if (temperature < 0 && temperature >= -18)
      {
         System.out.print("cold");
      }
      else if (temperature == 0)
      {
         System.out.print("freezing point of water");
      }
      else if (temperature > 0 && temperature <= 10)
      {
         System.out.print("very cool");
      }
      else if (temperature > 10 && temperature <= 20)
      {
         System.out.print("moderate");
      }
      else if (temperature > 20 && temperature <= 30)
      {
         System.out.print("warm");
      }
      else if (temperature > 30 && temperature <= 40)
      {
         System.out.print("hot");
      }
      else if (temperature > 40 && temperature < 100)
      {
      System.out.print("extremely hot");
      }
      else if (temperature >= 100)
      {
      System.out.print("boiling point of water");
      }
   }
}