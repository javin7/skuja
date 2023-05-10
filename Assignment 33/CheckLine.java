import java.util.*;

/*
CheckLine
Programmer: Javin Liu
Last modified on: 22.05.30
Calculate if two lines are same length or parallel using a method from another class
*/

public class CheckLine {
   public static void main(String[] args) {
      //Variables
      double line1y1, line1y2, line1x1, line1x2;
      double line2y1, line2y2, line2x1, line2x2;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get user input of line 1
      System.out.println("Please enter the two coordinates of line 1:");
      System.out.print("Vertex 1 x-value:");
      line1x1 = n.nextDouble();
      System.out.print("Vertex 1 y-value:");
      line1y1 = n.nextDouble();
      System.out.print("\nVertex 2 x-value:");
      line1x2 = n.nextDouble();
      System.out.print("Vertex 2 y-value:");
      line1y2 = n.nextDouble();
      
      //Get user input of line 2
      System.out.println("\nPlease enter the two coordinates of line 2:");
      System.out.print("Vertex 1 x-value:");
      line2x1 = n.nextDouble();
      System.out.print("Vertex 1 y-value:");
      line2y1 = n.nextDouble();
      System.out.print("\nVertex 2 x-value:");
      line2x2 = n.nextDouble();
      System.out.print("Vertex 2 y-value:");
      line2y2 = n.nextDouble();
      
      //Output if lines are the same length
      if (Line.length(line1x1,line1y1,line1x2,line1y2) == Line.length(line2x1,line2y1,line2x2,line2y2)) {
         System.out.print("\nResults:\nThe two lines have the same length.");
      } else {
         System.out.print("\nResults:\nThe two lines do not have the same length.");
      }
      
      //Output if lines are parallel
      if (Line.slope(line1x1,line1y1,line1x2,line1y2) == Line.slope(line2x1,line2y1,line2x2,line2y2)) {
         System.out.print("\nThe two lines are parallel.");
      } else {
         System.out.print("\nThe two lines are not parallel.");
      }
      
   }
}