interface Alpha
{
   public default void disp()
   {
      System.out.println("alpha disp");
   }
}
class Beta implements Alpha
{
   public void disp(){}     // we can override default method 
}
class Demo
{
   public static void main(String args[])
   {
        Alpha aobj = new Beta();
		aobj.disp();
   }
}