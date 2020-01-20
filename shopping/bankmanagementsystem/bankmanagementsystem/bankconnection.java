package bankmanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
public class bankconnection 
{
public Connection getConnection() throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;//Connection is type,con is object
//create connection
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");

//object=class .method         (API:databse://server name:portnumber/DB-Name,
if(con!=null)//connection checking
{
return con;
}
else
{
return null;
}
}
}