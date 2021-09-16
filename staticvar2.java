import java.util.*;
public class Student {
private String name;
private long contact;
private final int id;
private static int id_counter;
 static 
 {
	 Scanner cin = new Scanner(System.in);
	
	 id_counter = cin.nextInt();
	 
	 
 }
 Student(String nm,long con)
 {id = id_counter;
	 name = nm;contact = con;
	 id_counter++;
 }
 Student()
 {
	name = null;
	contact = 0;
	id = id_counter;
	id_counter++;
 }
 public void setDetails(String nm,long con)
 {
	 name = nm;
	 contact = con;
 }
 public void show()
 {
	 System.out.println(id +" "+name+" "+contact);
 }
}

public class Demo {

	public static void main(String[] args) {
		Student s1= new Student ("arun",2423524);
		Student s2= new Student ("varun",976524);
		Student s3= new Student ("hello",86797524);
		System.out.println("details of s1");s1.show();
		System.out.println("details of s3");s3.show();
		System.out.println("details of s2");s2.show();

		;

	}

}
