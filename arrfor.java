class Demo
{
 public static void main(String args[])
 {
  int sum = 0;
  int marks[] = new int[5];
  marks[0]=1;
  marks[1]=1;
  marks[2]=3;
  marks[3]=15;
  for (int val : marks)
  {
    sum += val;
	//System.out.println(sum);
  }
  System.out.println(sum);
  System.out.println(sum/marks.length);
 }
}