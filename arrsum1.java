class Rect
{
  private double length;private double breadth;
  public Rect(){}
  public Rect(double l, double b)
  {length = l; breadth = b;}
  public void show(){System.out.println(length +" " +breadth);}
  public double area(){return length * breadth;}
}
class Alpha
{
  public static Rect maxRect(Rect arr[])
  {
    double max= 0; Rect res = null;
	if(arr.length != 0)
	{
	  res = arr[0];
	  max = arr[0].area();
	  for(int i; i<arr.length;i++)
	  {
	    if(max < arr[i].area())
		{
		  res = arr[i];
		  max = arr[i].area();
		}
	  }
	}
	return res;
  }
}
class SumApp
{
  public static void main(String args[])
  {
    Rect arr[] = new Rect[3];
	arr[0] = new Rect(2,3);
	arr[1] = new Rect(1,5);
	arr[2] = new Rect(5,6);
	Rect res = Alpha.maxRect(arr);
	if(res != null)
	{
	  res.show();
	}
  }
}