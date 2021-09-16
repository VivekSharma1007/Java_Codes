class Parent
{
  static 
  {
    System.out.println("parent loading"); // 1
  }
  Parent(){System.out.println("in parent const ");}   // 4
}
class Child extends Parent
{
   static
   {
     System.out.println("child loading");  // 2
   }
   Child ()
   {
	   // super(); internally  // 3
	   System.out.println("in child const ");   // 5
   }
}  
class Demo
{
    public static void main(String args[])
	{
	   Child cobj = new Child();
	   	   
    }
}