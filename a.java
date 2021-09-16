class A
{
 private int a = 10;
 {
   int a = 99;
   System.out.println("in init a = "+a);
   a=a+10;
 }
 public A()
 {
  a=a+100;
  System.out.println("in const a = "+a);
 }
 public void show()
 {
  System.out.println("a= "+a);
 }
}
class Aa
{
 public static void main(String args[])
 {
  A a = new A();
  a.show();
 }
}