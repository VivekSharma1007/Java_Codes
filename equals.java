class Rect
{
   private int length, breadth;
   Rect(){}
   Rect(int length, int breadth){this.length = length; this.breadth= breadth;}
   public boolean equals(Object obj)
   {
      Rect temp = (Rect)obj;
	  return this.length == temp.length && this.breadth == temp.breadth;
   }
}
class Demo
{
   public static void main(String args[])
   {
      Rect r1 = new Rect(55,78);
	  Rect r2 = new Rect(55,78);
	  Rect r3 = new Rect();
	  Rect r4 = new Rect(5,78);
	  System.out.println(r1.equals(r2));
	  System.out.println(r1.equals(r3));
	  System.out.println(r1.equals(r4));
	  System.out.println(r3.equals(r2));
	  String s1 = new String("hello");
	  String s2 = new String("hello");
	  System.out.println(s1 == s2);
	  System.out.println( s1.equals(s2));
	  
   }
}