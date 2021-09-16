class Demo
{
	public static void main(String args[])
	{
       double hindi_mark[] = {44,55,66,34}; // decleration of reference variable to array object
      double ss_mark[];
      ss_mark = hindi_mark;
      ss_mark[2] = -33; // changes reflect in array
       
       for (int i = 0; i<hindi_mark.length; i++)
       {
         System.out.println(hindi_mark[i]);
         System.out.println("hindi_mark[" + i +"]="+hindi_mark[i]);
        }
     }
}