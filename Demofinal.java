class Rect
{
 private final int length=23;
 private final int breadth=34;
// {length = 3; breadth = 4;}
 //public Rect()
 //{ 
 // length = 2; breadth = 5;
// }
// public Rect (int l,int b)
// {
 // this();
 // this.length = l;
 // this.breadth = b;
 // }
 public void changeDetails(int l , int b)
 {
  length = l; breadth  = b;
 }
 public void show ()
 {
  System.out.println(this.length +"  " +this.breadth);
 }
}
class Demofinal
{
 public static void main(String args[])
 {
  //Rect obj1 = new Rect (23,45);
  //obj1.show();
 // Rect obj2 = new Rect();
 // obj2.show();
  }
}