class Alpha 
{
    static void disp()
	{
	    System.out.println("Alpha disp");
	}
}
class Beta extends Alpha 
{
    static void disp(){System.out.println("Beta disp");}
}
class Demo
{
   public static void main(String args[])
   {
        Beta.disp();
   }
}