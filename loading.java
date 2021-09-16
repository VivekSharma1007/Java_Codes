class Alpha{static {System.out.println("alpha loading");}}
class Demo
{
   static {System.out.println("demo loading ");}
   public static void main(String args[])
   {
      try{
	   
	     // Class.forName(args[0]);        // can pass any class name
	      Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("get loaded");
	     }catch(Exception e)
		 {
		    System.out.println("pass class name");
		 }
   }
}