package bankmanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class stafflogin {
	bankconnection con=new bankconnection();
	public void staffuser() throws SQLException, ClassNotFoundException{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the username:");
	String name=s.next();
	System.out.println("Enter the password:");
	String pass=s.next();
	Statement st=con.getConnection().createStatement();
	ResultSet set=st.executeQuery("select * from staff");
	while(set.next()) {
	//to display the values
	String name1=set.getString(1);
	String pw1=set.getString(2);

	if(name1.contentEquals(name)&& pass.contentEquals(pw1))
	{
	System.out.println("---------Staff Successfully login---------");
	}
	else 
	{
	System.out.println("Login Failed!!");
	bankhome op=new bankhome();
	op.option1();
	}
	}
	staffhome op=new staffhome();
	op.staffuser();
	}
	} 

