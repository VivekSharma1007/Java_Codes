interface Shape
{
   int area();
}
class Rect implements Shape
{
    public int area()
	{
	   System.out.println("area by rect"); return 0;
	}
}
class Tri implements Shape
{
    public int area()
	{
	   System.out.println("area by tri"); return 0;
	}
}
class Demo
{
   public static void main(String args[])
   {
      Shape sobj = null;
	  sobj = new Rect();
	  sobj.area();
	  sobj = new Tri();
	  sobj.area();
   }
}
