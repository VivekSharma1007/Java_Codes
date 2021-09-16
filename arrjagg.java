class Demo
{
 public static void main(String args[])
 {
 int arr[][] = new int[4][];
 arr[0] = new int[3];
 arr[1] = new int[4];
 arr[2] = new int[1];
 arr[3] = new int[5];
 System.out.println(arr );
 System.out.println(arr.length);
 for(int row= 0; row<arr.length;row++)
 {
	 for(int col=0; col<arr[row].length;col++)
	 {
		 System.out.print(arr[row][col]+" ");
	 }
	 System.out.println();
 }
 }
}