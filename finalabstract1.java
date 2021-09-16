   

   abstract class Shape
    {
      	abstract int area();
		 
	}
	 //  we can create final child class from abstract class
	 
    final class Rect extends Shape
	 {
	      int area()
		  {
			  System.out.println(" area by rect.. ") ;  return    0;
		  }		  
	 }
	 
	 
	class Demo6
	   {
	     public static void main(String args[] )
			{
                    Shape  sobj;
    					sobj   =new  Rect();
						 sobj.area();
						 
		   }	  
	   }