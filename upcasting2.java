class Batra
{
  public void drinking(){System.out.println("lemon water");}
}
class PunjabiBatra extends Batra
{
  public void drinking(){System.out.println("pepsi");}
}
class GujratiBatra extends Batra
{
   public void drinking(){System.out.println("coke");}
}
class BangaliBatra extends Batra
{
   public void drinking(){ super.drinking(); }
}
class OutHouse
{
   public static void welcomeService( Batra ob)
   {
     System.out.println("welcome sir");
	 ob.drinking(); 
   }
}
class Demo
{
    public static void main(String args[])
	{
	   GujratiBatra gob = new GujratiBatra();
	   PunjabiBatra pob = new PunjabiBatra();
	   BangaliBatra bob = new BangaliBatra();
	   OutHouse.welcomeService(gob);
	   OutHouse.welcomeService(pob);
	   OutHouse.welcomeService(bob);
	}
}