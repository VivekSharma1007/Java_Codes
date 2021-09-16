/*class Alpha
{
   public static String[] getList(String arr[])
   {
     String a[] = new String[5];
	 for(int i=0 ; i<arr.length;i++)
	 {
	   if(arr.length > 4)
	   {
	      a[i] = arr[i];
	   }
	 }
	 return a;
   }
}*/
class Demo
{
  public static void main(String args[])
  {
    
	 String cities[] = {"rtk","ggn","ljfdshvld","sghsjr6duf"};
	 String arr[] = new String[4];
	if (cities.length != 0)
	{
		for(int i = 0;i<cities.length;i++)
		{
			arr[i] = arr[i].length();
		}
	}
	 //String flist[] = Alpha.getList(cities);
     for(String val : arr)
     {
	   System.out.println(val+" ");
	 }	 
  }
}