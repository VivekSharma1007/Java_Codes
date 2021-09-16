class User
{
  public static void main(String args[])
  {
    System.out.println("in user ");
	System.out.println("in user "+args);
	System.out.println("in user "+args.length);
	for(String val : args)
	{
		System.out.println(val);
	}
	
  }
}