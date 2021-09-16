class Parent
{
  private int money ;
  Parent()         // 3
  {
     System.out.println("in parent const zero param ");  // 4
	 money = 1000;  // 5
  }
  Parent (int m)
  {
    System.out.println("in parent const with param");
	money = m;
  }
  public void show()
  {
    System.out.println("parent money = "+money);
  }
}
class Child extends Parent
{
   private int money ;
   Child()
   {
      System.out.println("in child const zero param");
   }
   Child (int m)
   {     // case 2 by putting it by own               case 1 super(); default
	     //  super(m);                    // 2  by default it will call default const by super(); internally
      System.out.println("in child const param");  // 6
	  money = m;   // 7
   }
 // public void show()   // 9
 // {   super.show();    // 10
	//  System.out.println("child money = "+money);}
}

class Demo
{
  public static void main(String args[])
  {
     Child obj = new Child(23);   // 1
	 obj.show();  // 8
  }
}