interface Shape
{
   int area();
}
interface FillShape
{
   void fillcolor();
}
class Rect implements Shape , FillShape
{
    public int area()
	{
	   System.out.println("area by rect"); return 0;
	}
	public void fillcolor()
	{
	   System.out.println("fill by rect");
	}
}
class Demo
{
    public static void main(String args[])
	{
	    Rect r1 = new Rect();
		r1.area(); r1.fillcolor();
		Shape s1 = new Rect();
		s1.fillcolor(); s1.area();
		FillShape f1 = new Rect();
		f1.fillcolor(); f1.area();
	}
}