class Rect 
{
    private double length; 
	private double breadth;
}
public Rect()
{
    length = 0;
	breadth =0;
}
public Rect(double l, double b)
{
    length = l; breadth = b;
}
public void show()
{
    System.out.println(length + "     "   breadth);
}
class Demo
{
    public static void main(String args[])
	{
	     Rect obj1 = new Rect();
		 Rect obj2 = new Rect(100,200);
		 obj2.show();
		 
	}
}