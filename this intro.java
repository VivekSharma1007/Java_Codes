public class Rect()
{
	double length; double breadth;
	 public Rect()
	 {
		 length = 10; breadth = 20;
	 }
	 public Rect(double l, double b)
	 {
		 length = l; breadth = b;
	 }
	 public sum(Rect x)
	 {
		 Rect temp = new Rect();
         temp.length = x.length + this.length;
         temp.breadth = x.breadth + this.breadth;		 
	 }
	public void show()
	{
       System.out.println("in show this "+ this);		
	}
}
class Demo
{
	public static void main(String args[])
	{
		Rect obj1 = new Rect(2,4);
		Rect obj2 = new Rect(5,7);
		Rect obj3 = null;
		obj3 = obj1.sum(obj2);
		obj3.show();
	}
}