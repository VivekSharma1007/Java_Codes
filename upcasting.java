class Parent
{
   void transport()
   {
       System.out.println("simple bike");
   }
}
class Child extends Parent
{
    void transport()   // method overriding
	{
	    System.out.println("sports bike");
	}
}
class Demo
{
   public static void main(String args[])
   {
        Parent obj = new Child();  // upcasting
		obj.transport();
   }
}