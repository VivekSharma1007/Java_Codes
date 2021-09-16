interface Alpha 
{void disp();} // this must be overridn bcz it has same name
interface Beta 
{
    public default void disp()    // with this
	{
	     System.out.println("Beta disp"); 
	}
}
class D implements Beta {}
class Gamma extends D implements Alpha {public void disp(){}}  // it is overridden method
class Demo
{
    public static void main(String args[])
	{
	    Gamma gobj = new Gamma();
		gobj.disp();
    }
}