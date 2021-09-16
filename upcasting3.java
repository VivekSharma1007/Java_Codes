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
      Shape sobj;
	  Tri tobj = new Tri();
	  Rect robj = new Rect();
	  sobj = robj; sobj.area();
	  sobj = tobj; sobj.area();
   }
}