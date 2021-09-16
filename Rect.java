public class Rect
{
   private final int length;
   private final int breadth;
   {
     length = 3; breadth = 9;
   }
   public Rect(int l, int b)
   {
      //this();
	  this.breadth = b;
	  this.length = l;
   }
  // public void changDetails(int l, int b)
   //{
    // length = l; breadth = b;
   //}
   public void show()
   {
     System.out.println(this.length +"   " + this.breadth);
   }
}
class Demo
{
   public static void main(String args[])
   {
       Rect obj1 = new Rect();
	   obj1.show();
	   Rect obj2 = new Rect(44,55);
	   obj2.show();
   }
}
