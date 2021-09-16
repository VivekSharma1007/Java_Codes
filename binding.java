class Shape
{
  int area(){System.out.println("in shape area"); return 0;}
}
class Rect extends Shape
{
   int area(){System.out.println("in rect area"); return 0;}
}
class Demo
{
  public static void main(String args[])
  {
     Shape sobj = new Rect();
     sobj.area();  
  }
  
}
