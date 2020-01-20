package shopping;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View 
{
	Connectionm con=new Connectionm();
	public void vieww()throws SQLException, ClassNotFoundException
	{
		Statement st=(Statement) con.getConnection().createStatement();
		ResultSet set=st.executeQuery("select * from addproduct");
		System.out.println("List of product");
		while(set.next())
		{
			System.out.println("##########*********#########");
			System.out.println(set.getInt(1)+"->"+set.getString(2)+"->"+set.getInt(3)+"->"+set.getInt(4));
		}
		home first=new home();
		first.option();
}
}
