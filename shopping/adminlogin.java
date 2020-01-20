package shopping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.*;
public class adminlogin {
	
	Connectionm con=new Connectionm();
		public void log() throws SQLException, ClassNotFoundException
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=s.next();
		System.out.println("Enter the password");
		String pass=s.next();
		int flag=1;
		Statement st1=con.getConnection().createStatement();
		ResultSet set=st1.executeQuery("select * from adminlogin");
		while(set.next()) {
		String name1=set.getString(2);
		String pw1=set.getString(3);

		if(name1.contentEquals(name)&& pass.contentEquals(pw1))
		{
			System.out.println("Successfully Verified...");
		}
		else {
			System.out.println("Login Failed!!");
		}
	}
		home first=new home();
		first.option();
}
}
