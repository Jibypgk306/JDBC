package bankmanagementsystem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class bankuser {
	bankconnection con=new bankconnection();
	public void userlogin() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username:");
		String name=s.next();
		System.out.println("Enter the password:");
		String pass=s.next();
		int flag=1;
		Statement st1=con.getConnection().createStatement();
		ResultSet set=st1.executeQuery("select * from user");
		while(set.next()) {
		String name1=set.getString(1);
		String pw1=set.getString(2);
		if(name1.contentEquals(name)&& pass.contentEquals(pw1))
		{
			System.out.println("Successfully Verified...");
		}
		else {
			System.out.println("Login Failed!!");
		}
	}
		userhome first=new userhome();
		first.option1();
	}
}
