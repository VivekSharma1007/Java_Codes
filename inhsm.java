class Parent
{
  void marriageSystem()
 {
  System.out.println("Acc to custom ");
 }
}
class Child extends Parent
{
 void marriageSystem()
 {
  System.out.println("in my own way");
  super.marriageSystem();
 }
}
class Demo
{
 public static void main(String args[])
 {
  Child obj = new Child();
  obj.marriageSystem();
 }
}