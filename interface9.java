interface Gamma 
{
	int x = 99;
	static void disp(){System.out.println("Alpha disp");}
}
interface Beta extends Alpha 
{
	static void disp(){System.out.println("Beta disp");}
}
class Demo
{
   public static void main(String args[])
   {
       Alpha.disp();
	   Beta.disp();
    }
}