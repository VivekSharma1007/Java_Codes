interface A
{
   void showA();
}
interface B
{
   void showB();
}
class C implements B
{
    public void showA(){System.out.println("A");}
	public void showB(){System.out.println("B");}
}
class Demo
{
    public static void main(String args[])
	{
	  // A obj1 = new C();  obj1.showA();  // invalid
	   B obj2 = new C();  obj2.showB(); 
	   C obj3 = new C();  obj3.showB();  obj3.showA();
	   
	}
}