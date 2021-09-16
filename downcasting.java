class Shape
{
  int area () {return 0;}
}
class Tri extends Shape
{
  int area (){System.out.println("area of tri"); return 0;}
}
class Rect extends Shape
{
  int area (){System.out.println("area of rect"); return 0;}
}
class Demo
{
  public static void main(String args[])
  {
     Rect robj;
	 Shape sobj = new Rect();
	 robj = (Rect)sobj;
	 robj.area();
  }
}