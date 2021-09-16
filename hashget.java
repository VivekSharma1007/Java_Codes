class Rect {}
class Demo
{
   public static void main(String args[])
   {
      Rect robj = new Rect();
	  System.out.print(robj.getClass().getName()+"@");
	  System.out.println(Integer.toHexString(robj.hashCode()));
	  String str = robj.getClass().getName()+"@"+Integer.toHexString(robj.hashCode());
	  System.out.println(str);
   }
}