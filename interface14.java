interface Shape
{
   int area();
}
class Rect implements Shape
{ 
    public int area()
	{
	    System.out.println("Rect area"); return 0;
	}
}
class Tri implements Shape
{
    public int area()
	{
	   System.out.println("tri area"); return 0;
	}
}
class Alpha 
{
   void aFun(Shape obj){obj.area();}
}
class Demo extends Alpha
{
   public static void main(String args[])
   {
       Alpha obj = new alpha();
	   obj.aFun(new Rect());
	   obj.aFun(new Tri());
   }
}