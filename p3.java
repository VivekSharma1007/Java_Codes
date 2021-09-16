public class Rect
{
 double length;
 double breadth;
 public Rect (double x , double y)
 {
  length = x;
  breadth = y;
 }
 public Rect ()
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
  Rect obj = new Rect();
  obj.show();
  Rect obj1 = new Rect();
  obj1.show();
  Rect obj2 = new Rect(34,54);
 }
}