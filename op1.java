import java.util.*;
class Demo
{
 public static void main(String args[])
 {
   Scanner cin=new Scanner(System.in);
   System.out.print("enter ur marks");
   int marks=cin.nextInt();
   marks=(marks >= 1 && marks <= 40)?marks +10: marks +5;
   System.out.println("marks = " +marks);
 }
}