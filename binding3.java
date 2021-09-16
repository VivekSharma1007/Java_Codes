class A
{
  public static void invoke (A ob)
  {
     System.out.println("in invoke ");
	 ob.show();
  }
  private void show()
  {
	  System.out.println("A class show");
  }
 /* private void show()
  {
     System.out.println("A class show");
  }*/
}
class B extends A
{
   public void show()
   {
     System.out.println("B class show");
   }
}
class Demo
{
   public static void main(String args[])
   {
     A aobj = new A();
	 B bobj = new B();
	 A.invoke(aobj);
	 A.invoke(bobj);
	 A aobj1 = new B();
	 A.invoke(aobj1);
   }
}