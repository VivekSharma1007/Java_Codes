class Alpha 
{
    public static int x = 10; 
	public int y = 20;
	void increement()
	{   
	    x++; y++;
	}
	void show()
	{
	   System.out.println("x = "+x +"y = "+ y);
	}
}
class Demo
{
    public static void main(String args[])
	{
	   Alpha obj1 = new Alpha();
	   Alpha obj2 = new Alpha();
	   Alpha obj3 = new Alpha();
	   obj1.increement();   obj2.increement();   obj3.increement();
	   obj1.show();   obj2.show();    obj3.show();
	}
}