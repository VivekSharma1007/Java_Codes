class Person
{
  public void driving(Bike obj)
  {
    
	obj.drvExp();
  }
  public void driving(Car obj)
  {
    obj.drvExp();
  }
}


class Bike           
{
   public void drvExp( )            
   {
      System.out.println("m riding 2 wheeler ");
   }
}


class Car
{
   public void drvExp( )
   {
      System.out.println("m riding 4 wheeler ");	  
   }

}

class Demo
{
  public static void main(String args[])
  {
      Person mahesh= new Person();
	  Car cobj=new Car();
	  Bike bobj=new Bike();
	  mahesh.driving(cobj); mahesh.driving(bobj);
  
  
  }
}




