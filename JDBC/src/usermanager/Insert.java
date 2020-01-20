package usermanager;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.PreparedStatement;
public class Insert 
{
	
	public void ins() throws SQLException, ClassNotFoundException
	{
		Conc con=new Conc();
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern paswordpattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		System.out.println("1)User Details");
		System.out.println("2)Admin Details");
		System.out.println("enter the choice");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
		{
		System.out.println("enter the id");
		int uid=s.nextInt();
		System.out.println("Enter the username");
				String username=s.next();
		System.out.println("Enter the password");
		String pwd=s.next();
		String query="INSERT INTO `user` (`id`,`username`, `pwd`) VALUES (?, ?, ?);";
        PreparedStatement st=(PreparedStatement) con.getConnection().prepareStatement(query);
		//String query1="INSERT INTO `admin`(`aid`,`adminname`, `apwd`) VALUES (?,?,?)";
        //PreparedStatement ps=(PreparedStatement) con.getConnection().prepareStatement(query1);
		st.setInt(1,uid);
		st.setString(2,username);
		st.setString(3,pwd);
		st.executeUpdate();
		System.out.println("data saved");
		}
		case 2:
		{
		System.out.println("enter the id");
		int aid=s.nextInt();
		System.out.println("Enter the Adminname");
		String adminname=s.next();
		System.out.println("Enter the password");
		String apwd=s.next();
		String query1="INSERT INTO `admin`(`aid`,`adminname`, `apwd`) VALUES (?,?,?)";
        PreparedStatement ps=(PreparedStatement) con.getConnection().prepareStatement(query1);
		ps.setInt(1,aid);
		ps.setString(2,adminname);
		ps.setString(3,apwd);
		ps.executeUpdate();
		System.out.println("data saved");
		}
		}
		Manager ma=new Manager();
		ma.choice();
		}
		}
