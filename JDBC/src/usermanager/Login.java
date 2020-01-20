package usermanager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import corrected.Firstapp;

public class Login {
	Conc con=new Conc();

	public void logg()throws SQLException, ClassNotFoundException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=s.next();
		System.out.println("Enter the password");
		String pass=s.next();
		int flag=1;
		Statement st1=con.getConnection().createStatement();
		Statement st2=con.getConnection().createStatement();

		ResultSet set=st1.executeQuery("select * from user");
		ResultSet sett=st2.executeQuery("select * from admin");
		while(set.next()) {
		//to display the values
		String name1=set.getString(2);
		String pw1=set.getString(3);

		if(name1.contentEquals(name)&& pw1.contentEquals(pass))
		{
			System.out.println("Student Successfully login...");
		}
		else
		{
			while(sett.next()) {
				//to display the values
				String name2=sett.getString(2);
				String pw2=sett.getString(3);

				if(name2.contentEquals(name)&& pw2.contentEquals(pass))
				{
					System.out.println("Admin Successfully login...");
				}
				else
				{
					System.out.println("Login failed!!");
				}
				Manager ma=new Manager();
				ma.choice();
			}
	}	
		}
	}
}