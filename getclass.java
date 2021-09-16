class Alpha {}
class Book {}
class Demo
{
  public static void main(String args[])
  {
      Alpha aobj = new Alpha();
	  System.out.println(aobj.getClass());
      Book bobj = new Book();
      System.out.println(bobj.getClass());
      System.out.println(aobj.getClass().getName());
      System.out.println(bobj.getClass().getName());	  
  }
}