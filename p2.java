import java.util.*;
class Person
{
  private String name;
  private int age ;
  private int code;
  
  public void showDetails()
  {
   System.out.println(name +"  "+ age +"  "+ code);
  }
  public void setDetails()
  {
    Scanner cin = new Scanner(System.in);
	System.out.print("enter name ");
	name = cin.nextLine();
	System.out.print("enter age ");
	age = cin.nextInt();
	System.out.print("enter code ");
	code = cin.nextInt();
	
  }
}
class Demo
{
  public static void main (String args[])
  {
    Person obj = new Person();
	obj.setDetails();
	obj.showDetails();
  }
}