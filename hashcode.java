class Rect
{
	private int length, breadth;
	public Rect(){}
	public Rect(int l, int b) {length = l; breadth = b;}
}
class Demo
{
   public static void main(String args[])
   {
      Rect robj1 = new Rect(10,20);
	  Rect robj2 = new Rect(1,2);
	  Rect robj3 = new Rect(12,40);
	  System.out.println(robj1); // Rect@223e34f3
	  System.out.println(robj2);
	  System.out.println(robj3);
	  System.out.println(robj1.hashCode());  // 18181818
	  System.out.println(robj2.hashCode());
	  System.out.println(robj3.hashCode());
	  int x = robj1.hashCode();
	  String str = Integer.toHexString(x);
	  System.out.println(str);
   }
}