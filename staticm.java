class Alpha
{
 public static int sum(int x,int y)
 {
  return x+y;
 }
 public static double avg(double x , double y)
 {
  return (x+y)/2 ;
 }
}
class Demo
{
 public static void main(String args[])
 {
 int res = Alpha.sum(10,25);
  System.out.println(res);
  double res1 = Alpha.avg(10,25);
  System.out.println(res1);
 }
}