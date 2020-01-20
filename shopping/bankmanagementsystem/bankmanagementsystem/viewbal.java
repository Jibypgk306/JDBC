package bankmanagementsystem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class viewbal {
	Scanner s=new Scanner(System.in);
	bankconnection con=new bankconnection();
	public void viewbalance() throws ClassNotFoundException, SQLException 
	{
		System.out.println("Enter Your Account Number..");
		int acno=s.nextInt();
		Statement st=(Statement) con.getConnection().createStatement();
		ResultSet set=st.executeQuery("SELECT amount FROM `addmoney` WHERE  accno="+acno);
		System.out.println("Balance Information");
		while(set.next())
		{
			System.out.println(set.getInt("amount"));
		}
		userhome first=new userhome();
		first.option1();
		}
}