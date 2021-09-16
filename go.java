class Demo
{
 public static void main (String args[])
 {
   int x=5;
   System.out.println("int main");
   top:{
         System.out.println("in top");
       
    outer:{
	        System.out.println("in outer");
	      
	inner:{
	        System.out.println("in inner most");
			if(x == 5)
			 {
			   break outer;
			 }
	      }  
          System.out.println("in outer ");
            }
			System.out.println("back in top");
        }
    System.out.println("exiting from main");		
 }
      
}