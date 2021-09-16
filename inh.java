class Parent
{
 public void talking()
 {
  System.out.println("talking in hindi");
 }
}
class Child extends Parent
{
 
}
class Demo
{
 public static void main(String args[])
 {
  Child obj = new Child();
  obj.talking();
 }
}