package bankmanagementsystem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class addmoney 
{
	bankconnection con=new bankconnection();
	int balance=0;
	Scanner s=new Scanner(System.in);
	public void money() throws SQLException, ClassNotFoundException 
	{	
	System.out.println("Please Enter Your Account Number:");
	int acno=s.nextInt();
	System.out.println("Enter the Amount:");
	int amnt=s.nextInt();
	PreparedStatement stt=con.getConnection().prepareStatement("INSERT INTO addmoney(accno,amount) VALUES (?,?)");
	stt.setInt(1, acno);
	stt.setInt(2, amnt);
	stt.executeUpdate();
	balance=balance+amnt;
	amnt=balance;
	System.out.println("The entered Amount is added Successfully!!");
	userhome first=new userhome();
	first.option1();
	}
	public void withdraww() throws ClassNotFoundException, SQLException 
	{
		System.out.println("Enter your account number:");
		int acno=s.nextInt();
		System.out.println("Please enter the amount you want:");
		int amt=s.nextInt();
		Statement st=(Statement) con.getConnection().createStatement();
		ResultSet set=st.executeQuery("select * from addmoney");
		while(set.next())
		{
			int amount=set.getInt(2);
			balance=amount-amt;
		}
		System.out.println("Your balance:"+balance);
		if(amt<=10000)
		{
			System.out.println("Your transaction is completed.....");
			System.out.println("Thankyou.....");
			PreparedStatement x=con.getConnection().prepareStatement("UPDATE `addmoney` SET `amount`=? WHERE accno=?");			
			x.setInt(1,balance);
			x.setInt(2,acno);
			x.executeUpdate();	
		}
		else
		{
		System.out.println("Withdraw failed...");
		}
		userhome first=new userhome();
		first.option1();
		}
	}
