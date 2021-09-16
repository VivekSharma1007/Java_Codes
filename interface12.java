interface Alpha 
{void disp();}
interface Beta
{
   public default void disp()
   {
      System.out.println("Beta disp");
   }
}
class D
{
   public void disp(){System.out.println("D class disp");}
}
class Gamma extends D implements Alpha, Beta {}
class Demo extends Gamma
{
   public static void main(String args[])
   {
       Gamma gobj  = new Gamma();
	   gobj.disp();
   }
}