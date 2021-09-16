class Alpha
{
   // private int x= 10;    // this can not be accessed because of it is not static 
   private static int y = 20;     // in this class (static int access$0000()   )
   static class Beta
   {
      void show()
	  {
	     // System.out.println("x "+x);
		 System.out.println("y "+y);  // internally use getter method
	  }
   }
}
class Demo
{
    public static void main(String args[])
	{
	    Alpha.Beta obj = new Alpha.Beta();
		obj.show();
	}
}