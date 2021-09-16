class Parent
{int money= 100;
 public void talking()
 {
  System.out.println("talking in hindi");
   System.out.println(money);
 }
}
class Child extends Parent
{int money = 20;
 public void talking()
 {
  System.out.println("taling in eng");
   System.out.println(money);
 }
}
class Demo
{
 public static void main(String args[])
 {
  Child obj = new Child();
  obj.talking();
 
 }
}