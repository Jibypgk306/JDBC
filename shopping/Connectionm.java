package shopping;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connectionm 
	{
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
            return con;
			
	}
}