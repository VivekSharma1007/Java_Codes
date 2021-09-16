import java.util.*; 
import java.text.*;
class Test
{
    public static void main(String args[]) throws ParseException
	{
	  Scanner cin = new Scanner (System.in);
      System.out.println("enter some date value  DD/MM/YY");
	  String str = cin.nextLine();
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/Yy");
	  Date dobj = sdf.parse(str);
	  System.out.println(dobj);
 	}
} 