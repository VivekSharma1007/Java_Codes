class Demo
{
  public static void main(String args[])
   {
       System.out.println((int)'a');   // in java upsizing is allowed
       System.out.println((char)65);  // it seems to be downsizing but it is taking its ascii value
       System.out.println((int)25.6+(int)25.4);
       System.out.println((int)25.6+25.5);	   
   }
}