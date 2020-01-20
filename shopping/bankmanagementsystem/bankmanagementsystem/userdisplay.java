package bankmanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class userdisplay {

	public void userdisplay() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		{
		      bankconnection con=new bankconnection();
		Statement s1=(Statement) con.getConnection().createStatement();
		ResultSet r=s1.executeQuery("select * from userdetail");
		while(r.next())
		{
		System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4)+" "+r.getString(5)+" "+r.getString(6));


		}
		staffhome op=new staffhome();
		op.staffuser();
		}
		}


		
}