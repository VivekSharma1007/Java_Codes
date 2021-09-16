class Demo
{
 public static void main(String args[])
 {
  int arr [][] = new int[5][3];
  System.out.println(arr );
  System.out.println(arr.length);
  System.out.println(arr[1].length);
  for(int row = 0;row<arr.length; row++)
  {
   for(int col= 0;col<arr[row].length;col++)
   {
     System.out.println("arr["+row+"]["+col+"]"+arr[row][col]);
   }
  }
 }
}