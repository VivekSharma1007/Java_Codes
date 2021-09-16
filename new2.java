class Alpha
{
   static {System.out.println("Alpha loading ");}
   static int x = 90;
   static void aFoo(){System.out.println("in afoo");}
}
class Beta 
{
   static {System.out.println("beta loading");}
}
class Demo
{
   static {System.out.println("demo loading");}
   public static void main(String args[])
   {
      try{
	 Class.forName(args[0]);
     System.out.println("on request");
    }catch(ClassNotFoundException e)
     {e.printStackTrace();}
     catch(Exception e)
     {System.out.println("pass class name");}
      System.out.println("exiting from main");	 
	  
   }
}
