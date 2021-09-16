interface Alpha
{
   public default void disp(){System.out.println("Alpha disp");}
}
interface Beta extends Alpha 
{
    public default void disp(){System.out.println("Beta disp");}
}
class Gamma extends Alpha 
{}
class Demo
{
     public static void main(String args[])
	 {
	    // Beta bobj = new Gamma();
		// bobj.disp();
		Alpah aobj = new Alpha();

     }
}