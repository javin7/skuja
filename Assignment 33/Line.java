import java.util.*;

/*
Line
Programmer: Javin Liu
Last modified on: 22.05.30
*/

public class Line {
   //Calculate length
   public static double length (double x1, double y1, double x2, double y2) {
      double xDiff = Math.abs(x1 - x2);
      double yDiff = Math.abs(y1 - y2);
      
      return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
   }
   
   //Calculate slope
   public static double slope (double x1, double y1, double x2, double y2) {
      double xDiff = x2 - x1;
      double yDiff = y2 - y1;
      
      return yDiff/xDiff;
   }
}