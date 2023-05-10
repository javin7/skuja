class HW2_Output1 {

	public static void main(String[] args) {
   
	   System.out.println("Num   Square");
	   System.out.println("***   ******");
      
	   for (int i = 1; i < 6; i++) {
         System.out.println((i) + "     " + (int)Math.pow(i,2));
      }
      System.out.print("\n");
      for (int i = 1; i < 5; i++) {
         System.out.println((i) + "*" + (i) + " = " + (int)Math.pow(i,2));
      }
      
	}
}