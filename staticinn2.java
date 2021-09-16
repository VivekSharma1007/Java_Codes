class Alpha
{
    private static int x = 10;
	private static int y = 100;
	Alpha() {System.out.println("Alpha const");}
    static class Beta 
	{
	   Beta() {System.out.println("Beta const");}
	   void show()
	   {
	       System.out.println(x +"  " +y);
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
