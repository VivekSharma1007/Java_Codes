class Rect
{
 private double length;
 private double breadth;
}
public Rect()
{
 length = 0;
 breadth = 0;
}
public void show()
{
 System.out.println(length +"  "+breadth);
}
Rect sum(Rect x)
{
 Rect temp = new Rect();
 temp.length = x.length + length;
 temp.breadth = x.breadth + breadth;
 return temp;
}
class Demo
{
 public static void main(String args[])
 {
   Rect obj1 = new Rect(10,20);
   Rect obj2 = new Rect(100,200);
   Rect obj3 = null;
   obj3 = obj1.sum(obj 2);
   obj3.show();
 }
}