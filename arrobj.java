class Rect
{
 private double length, breadth;
 public Rect(){}
 public Rect(double l,  double b)
 {
  length = l; breadth = b;
 }
 public void show()
 {
  System.out.println(length +" "+breadth);
 }
 public double area(){return length * breadth;}
}
class SumApp
{
 public static void main(String args[])
 {
	 double max;
  Rect arr[] = new Rect[3];
  arr[0]= new Rect(2,3);
   arr[1]= new Rect(4,3);
    arr[2]= new Rect(2,5);
   if (arr.length != 0)
    {
	  Rect res = arr[0];
	  max = arr[0].area();
	  for(int i= 1;i<arr.length ; i++)
	  {
	   if (max < arr[i].area())
	   {
	    res = arr[i];
		max = arr[i].area();
	   }
	   res.show();
	  }
	  
	} 
else{System.out.println("list is empty");}	
 }
}