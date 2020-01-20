package jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

import com.mysql.jdbc.Connection;
public class Connectionmanager {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");//Register Driver
		Connection con=null;//Connection object is con and connection is type

		con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
//(API:Database:/Servername:port Number/DB-Name,Username,Password.	
		

		if(con!=null)//Connection checking
		{
			System.out.println("Connection Successful");
		}
		else
		{
			System.out.println("Connection Failed!!");
		}
		con.close();//Close the Connection
	}

}
