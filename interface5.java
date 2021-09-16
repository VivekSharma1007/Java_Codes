interface Alpha
{
   public default void disp()
   {
      System.out.println("alpha disp");
   }
}
class Beta implements Alpha
{}
class Demo
{
   public static void main(String args[])
   {
        Alpha aobj = new Beta();
		aobj.disp();
   }
}