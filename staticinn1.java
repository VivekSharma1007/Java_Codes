class Alpha
{
   private static int x = 99;
   private static int y = 10;
   static {System.out.println("Alpha loading");}
   static class Beta 
   {
      static {System.out.println("Beta loading");}   // loading of only beta class static block prooves weak has a form
	  void show()
	  {
	     System.out.println("x "+x);
	  }
   }
}
class Demo
{
    public static void main(String args[])
	{
	    Alpha.Beta obj = new Alpha.Beta();
		// obj.show(); // for using this java loads alpha class also to get x
	}
}
