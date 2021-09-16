import java.util.*;
class Rectg
{
 private double length;
 private double breadth;
 private String outlinecolor;
 
 /* public Rectg (double l, double b)
 {
  Scanner cin = new Scanner (System.in);
  length = l; breadth = b;
  outlinecolor = cin.nextLine();
 } */
 
 public Rectg ()
 {
  Scanner cin = new Scanner (System.in);
  length = 10;
  breadth = 20;
  outlinecolor = cin.nextLine();
 }
 public void show()
 {
  System.out.println(length +" "+breadth+" "+outlinecolor);
 }
}
class Demo
{
 public static void main(String args[])
 {
 // Rectg obj = new Rectg(23,34);
  // obj.show();
  Rectg obj1 = new Rectg();
  obj1.show();
 }
}