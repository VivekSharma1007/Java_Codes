class A
{
  public void show()
  {
     System.out.println("A class show");
  }
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
  public static void invoke (A ob)
  {
     System.out.println("in invoke ");
	 ob.show();
  }
  public static void main(String args[])
  {
     A aobj = new A();
	 B bobj = new B();
	 // Demo.invoke(aobj);
	 Demo.invoke(bobj);
  }
}