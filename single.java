class God
{
 private God(){}
 private static God gobj = null;
 static {gobj = new God();}
 public static God getGod()
 {
  return gobj;
 }
}
class User 
{
 public static void main(String args[])
 {
  God g1 = God.getGod();
  God g2 = God.getGod();
  System.out.println("g1 = "+g1+" "+"g2 = "+g2);
 }
}