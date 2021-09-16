class Demo
{
 public static void main(String args[])
 {
  int arr[]={
              {1,2,3},
			  {2,3,1},
			  {2,4,5}
            };
	int max;int sum=0; int row_sum;
	for(int val : arr[0])
	{
	  sum +=val;
	}	
	System.out.println(sum);
 }
}