class Demo
{
 public static void main(String args[])
 {
  int arr[][]={
                  {14,25,36},
				  {22,1,23},
				  {20,10,32}
              };
    for(int row[]: arr)
	{
	 for(int val : row)
	 {
	   System.out.print(val+" ");
	 }
	 System.out.println();
	}
 }
}