class Rect
{
 private int l;
 private int b;
  public Rect()
 {
  this (0);
 }
 public Rect (int l)
 {
  this(l,l *2);
 }
 public Rect(int l, int b)
 {
  this();
  this.length = l;
  this.breadth = b;
  System.out.println("2 parameter ");
 }
 public void show ()
 {
  System.out.println(this.length+" " +this.breadth);
 }
}
 class Demo3this
 {
  public static void main(String args[])
  {
   Rect obj1 = new Rect(1,4);
   obj1.show();
  }
 }