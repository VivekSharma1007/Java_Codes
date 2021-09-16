class Outer
{
   private int x_data = 1000;
   private static int y_data = 2000;
   class Inner
   {
       public void show()
	   {
	      System.out.println("x = " +x_data);
		  System.out.println("y = " +y_data);
	   }
   }
}
class Demo
{
   public static void main(String args[])
   {
       Outer outobj = new Outer();
	   Outer.inner inob = outobj.new Inner();
	   inob.show();
   }
}