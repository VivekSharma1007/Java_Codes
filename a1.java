class Demo
{
 public static void main(String args[])
  {
    int age = 23;
    String name = "Vivek";
    double rate = 12.4;
    System.out.println(name);     // only copy the value of the given data
    System.out.println(age);
    System.out.println(rate);
    
    System.out.printf("\n name=%s ",name);     // another way of print statement
    System.out.printf("\n age = %d\n",age);

    System.out.println("value of name= "+name);   // how to write string in println 
    System.out.println("age = "+age);
  }
}