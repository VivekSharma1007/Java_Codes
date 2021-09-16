class Rect{
	private int length;
	private int breadth;
	Rect(){}
	Rect(int l,int b)
	{
		length = l; breadth  = b;
	}
	public void show ()
	{
		System.out.println("length = "+ length+" " +"breadth = "+breadth);
	}
	public int area()
	{
		return this.length * this.breadth;
	}
	public static void disp()
	{
		Rect robj = new Rect (10,20);
		int a = robj.area();
		System.out.println(a);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Rect.disp();
		Rect obj = new Rect();
		obj.disp();
	}
}