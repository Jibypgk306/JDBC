package bankmanagementsystem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class adviewbal {
		
			
			bankconnection con=new bankconnection();
			public void adview() throws ClassNotFoundException, SQLException 
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter Your Account Number..");
				int acno=s.nextInt();
				Statement st=(Statement) con.getConnection().createStatement();
				ResultSet set=st.executeQuery("SELECT amount FROM `addmoney` WHERE  accno="+acno);
				System.out.println("Balance Information");
				while(set.next())
				{
					System.out.println(set.getInt("amount"));
				}
				adminhome first=new adminhome();
				first.option1();
				}
		}