interface A {void showA();}
interface B {void showB();}
interface C extends A,B {void showC();}
class D implements C
{
   public void showA(){System.out.println("A");}
   public void showB(){System.out.println("B");}
   public void showC(){System.out.println("C");}
}
class Demo
{
   public static void main(String args[])
   {
       A obj1 = new D(); obj1.showA(); // obj1.showB();  invalid
       B obj2 = new D(); obj2.showB(); // obj2.showA(); invalid
	   C obj3 = new D(); obj3.showC();  obj3.showA(); obj3.showB();
	   D obj4 = new D();  obj4.showA();  obj4.showB();

	   
   }
}