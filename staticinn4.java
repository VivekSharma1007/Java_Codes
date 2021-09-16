class Alpha
{
   static class Beta
   {
      public static int x = 99;
      public int y = 100;	  
   }
}
class Demo
{
   public static void main(String args[])
   {
       System.out.println(Alpha.Beta.x);
	   System.out.println(new Alpha.Beta().y);
   }
}