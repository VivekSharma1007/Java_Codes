class Alpha
{
  public static void main(String ...args)  //similar to args[]
  {
    for(String val : args )
	{
	  System.out.println(val);
	}
  }
}
class User 
{
  public static void main(String args[])
  {
    String cities []= {"rtk","ggn","delhi"};
	Alpha.main(cities);
  }
}