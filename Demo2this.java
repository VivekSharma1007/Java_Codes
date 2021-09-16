class Rect
{
 private int length;
 private int breadth;
 // public Rect()
// {}
 public Rect(int length,int breadth)
 {
  this.length = length;
  this.breadth = breadth;
  }
 public Rect compare(Rect x)   // compare Rect (this Rect ,this x)
 {
	 int a1 = x.length * x.breadth;
	 int a2 = this.length * this.breadth;
	 if (a1>a2)
	 {return x;}
     return this;
 }
 public void show()
 {
  System.out.println(length +" "+breadth);
  }
}
class Demo2this
{
 public static void main(String args[])
 {
  Rect obj1 = new Rect(2,3);
  Rect obj2 = new Rect(3,4);
  Rect obj3 = new Rect (4,2);
  Rect obj4;
  obj4 = obj1.compare(obj2).compare(obj3);
  obj4.show();
  
 }
}