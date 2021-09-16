class Rect 
{
  private double length , breadth;
  public Rect(){}
  public Rect (double l, double b)
  {
    length = l; breadth = b;
  }
  public void show()
  {
    System.out.println(length+"  " +breadth);
  }
  public double area()
  {
    return length * breadth;
  }
}
class SumApp
{
  public static void main(String args[])
  {
    Rect arr[] = new Rect[4];
	System.out.println(arr);
	Rect r1 = new Rect(1,2);   // replace this by arr[0] = new Rect(1,2);
	Rect r2 = new Rect(12,2);
	Rect r3 = new Rect(1,32);
	Rect r4 = new Rect(4,21);
	arr[0] = r1;arr[1] = r2;arr[2] = r3;arr[3] = r4;
	for(Rect robj : arr)
	{
	  robj.show();
	}
  }
}