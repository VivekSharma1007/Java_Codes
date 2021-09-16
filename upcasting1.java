class Parent 
{
  void talking()
  {
     System.out.println("can talk in hindi");
  }
}
class Child extends Parent
{
   void dance()
   {
      System.out.println("can dance");
   }
   void talking()
   {
	   System.out.println("can speak in english");
   }
}
class Demo
{
   public static void main(String args[])
   {
      Parent obj = new Child();
	  obj.talking();
	//  obj.dance();  // not allowed
   }
}