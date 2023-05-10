import java.util.*;

/*
Divide17
Programmer: Javin Liu
Last modified on: 22.05.30
Write a program that “builds” a new number by joining two numbers entered by the user, then output the result of the new number divided by 17 (in two decimals places)
*/

public class Divide17 {
   public static void main(String[] args) {   
      //Variables
      String numOne, numTwo, splicedNum;
      double doubleTogether, divideSeventeen;
      
      //Scanner
      Scanner n = new Scanner(System.in);
            
      //Get integer 1
      System.out.println("Please enter a integer to splice ");
      numOne = n.nextLine();
      
      //Get integer 2
      System.out.println("Please enter another integer to splice ");
      numTwo = n.nextLine();
      
      //Concatenates strings together            
      splicedNum = numOne + numTwo;
      
      //Changes string to a double   
      doubleTogether = Double.parseDouble(splicedNum);
      
      //Divides the numbers by 17   
      divideSeventeen = doubleTogether/17;
   
      //Outputs the final number
      System.out.printf("%s divided by 17 is %.2f", splicedNum, divideSeventeen);
   }
}