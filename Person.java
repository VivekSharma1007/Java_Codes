class Bike
{
   public void drv()
   {
    System.out.println("in bike ");  
   }
}
class Car
{
   public void drv()
   {
     System.out.println("in car");
   }
}

class Person
{
   
    public void driving (Bike obj)
	{
		obj.drv();
	}
	public void driving (Car obj)
	{
		obj.drv();
	}
}


   class Demo
   {
	   public static void main(String args[])
	   {
		Person abc = new Person();
		Car cobj = new Car();
		Bike bobj = new Bike();
		abc.driving(bobj);
		abc.driving(cobj);
   
	   }
   }   