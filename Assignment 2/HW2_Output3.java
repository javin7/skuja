class HW2_Output3 {

   public static void main(String[] args)
   {
      for (int i = 0; i < 15; i++) 
      {
         System.out.print("\\");
      }
      System.out.println("");
            
      for (int i = 0; i < 5; i++) 
      {
         System.out.print("\\");
         for (int b = 0; b < 13; b++) 
         {
            System.out.print(" ");
         }
         System.out.print("\\\n");
      }
      for (int i = 0; i < 15; i++) 
      {
         System.out.print("\\");
      }
   }
}