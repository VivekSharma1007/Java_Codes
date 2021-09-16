class SumApp
{
  public static void main(String args[])
  {
    int sum = 0;
	for (String val : args)   // add string integers at rum time
	{
	  try{sum = sum + Integer.parseInt(val);}
	  catch (NumberFormatException e){}
	}
	System.out.println(sum);
  }
}