import java.util.*;
class Student
{
  public String name;
  public int rno;
  public int contactno;
  public Student(String nm,int rn, int cn )
  {
    name = nm; rno = rn; contactno = cn;
  }
  public Student()
  {
	  Scanner cin = new Scanner(System.in);
	  System.out.print("enter name ");name = cin.nextLine(); 
      System.out.print("enter roll no ");  rno = cin.nextInt();
	  System.out.print("enter contactno ");contactno = cin.nextInt();
  }
  public String toString ()
  {
     return "name = "+this.name +"  rno =" +this.rno +"   contactno = "+this.contactno;
  }
}
class Demo
{
  public static void main(String args[])
  {
    Student sobj = new Student("abc",23,436565);
	Student sobj1 = new Student();
	System.out.println(sobj);
	System.out.println(sobj1);
  }
}