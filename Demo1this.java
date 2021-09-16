class Rect
{
 private int length;
 private int breadth;
 public Rect(){}
 public Rect(int length,int breadth)
 {
  this.length = length;
  this.breadth = breadth;
 }
 public Rect increement()
 {
  this.length += length;
  this.breadth += breadth;
    return this;
 }
 public void show()
 {
  System.out.println(this.length+"  "+this.breadth);
 }
}
class Demo1this
{
 public static void main(String args[])
 {
  Rect obj1 = new Rect(24,14);
  Rect obj2;
  obj2 = obj1.increement();
  obj2.show();
 }
}