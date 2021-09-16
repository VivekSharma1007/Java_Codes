import java.sql.*; 
import java.util.*;
public class Demojdbc1 
{
    public static void main(String args[])  
    {
    	int id = 0; String name= null;  int salary=0; String ans = null;  
    	Scanner cin = new Scanner (System.in);
    	try{
    	Connection conn = null;
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
    	PreparedStatement stmt = conn.prepareStatement("insert into staff values(?,?,?,?)");
    	do{
    		System.out.print("enter id "); id=cin.nextInt();
    		System.out.print("enter name "); cin.nextLine();name=cin.nextLine();
   			System.out.print("enter salary ");   salary= cin.nextInt();
   			
    		stmt.setInt(1, id);    		stmt.setString(2, name);    stmt.setInt(3, salary); 
    		
    		
    		stmt.executeUpdate();
    		System.out.print("would u like to enter again y/n ");
    	     cin.nextLine();	ans=cin.nextLine();
    		stmt.close();conn.close();
    		 }while(ans.equals("y"));
    	}catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();
    	}catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    }
}
