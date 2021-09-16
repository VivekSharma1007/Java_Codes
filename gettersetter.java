class Rect 
{
    private int length;
	private int breadth;
	public void setLength(int length)  // setter
	{
	   this.length = length;
	}
	public void setBreadth(int breadth)   // setter
	{
	   this.breadth = breadth;
	}
	public int getLength()     // getter
	{return this.length;}
	public int getBreadth()      // getter
	{return this.breadth;}
}
class Demo
{
   public static void main(String args[])
   {
      Rect obj = new Rect();
	  obj.setLength(10);
	  obj.setBreadth(20);
	  System.out.println(obj.getLength());
	  System.out.println(obj.getBreadth());
   }
}