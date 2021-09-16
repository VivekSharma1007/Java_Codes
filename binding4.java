class A
{
  public static void invoke(A ob)
  {
     System.out.println("in invoke");
	 ob.show();
  }
  public static void show()
  {
     System.out.println("A class show");
  }
}
class B extends A
{
   public static void show()
   {
     A.show();
     System.out.println("B class show");
   }
}
class Demo
{
   public static void main(String args[])
   {
     B bobj = new B();
	 bobj.show();
   }
}