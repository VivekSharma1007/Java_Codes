import java.util.*;
class Demo
{
   public static void main(String args[])
   {
       Student s1 = new Student("Arun", 9999999);
	   Student s2 = new Student("varun",34353);
   }
}
class Student 
{
    private final int id;
	private String name;
	private long contact;
	private static int id_counter;
	static 
	{
	  Scanner cin = new Scanner(System.in);
	  System.out.println("beginning id");
	  id_counter = cin.nextInt();
    }
	Student()
	{
	    name = null;
		contact = 0;
		id = id_counter;
		id_counter++;
	}
	public void setDetails(String nm, long con)
	{
	    this.name = nm;
		this.contact = con;
	}
	public void show()
	{
	     System.out.println(id + "   "  + name + "   " + contact);
	}
}