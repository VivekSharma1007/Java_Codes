class Parent
{
 int money = 9999;
 void chkbal()
 {
  System.out.println("money = "+money);
 }
}
class Child extends Parent
{
 int money = 77;
 void chkbal()
 {
  System.out.println("from child " + money);
 System.out.println("from child " + super.money);
 System.out.println("from child " + this.money);
 }
}
class Demo
{
 public static void main(String args[])
 {
  Child obj = new Child();
  obj.chkbal();
 }
}