public class Rect1
{
 double length;
 double breadth;
 public Rect1 (double x , double y)
 {
  length = x;
  breadth = y;
 }
 public Rect1 ()
 {
  length = 3;
  breadth = 5;
 }
 public void show()
 {System.out.println(length +"   "+breadth);}
}
class Demo
{
 public static void main(String args[])
 {
  Rect1 obj = new Rect1();
  obj.show();
  Rect1 obj1 = new Rect1();
  obj1.show();
  Rect1 obj2 = new Rect1(34,54);
  obj2.show();
 }
}