package shopping;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Buy 
{
	Connectionm con=new Connectionm();
	public void buyy()throws SQLException, ClassNotFoundException
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Product id");
	int id=s.nextInt();
	System.out.println("Enter the Quanity");
	int qty=s.nextInt();
	int y;
	int cost = 0;
		Statement st=(Statement) con.getConnection().createStatement();
		ResultSet set=st.executeQuery("select * from addproduct");
		int q = 0;
		while(set.next())
		{
			int price=set.getInt(4);
			q=set.getInt(3);
			cost=qty*price;
		}
		System.out.println("Cost is:"+cost);
		System.out.println("Enter yes to confirm..");
		String one=s.next();
		 y=qty-q;
		if(one.contentEquals("yes"))
		{
			System.out.println("Your Booking Is Confirmed");
			System.out.println("Thankyou.....");
			PreparedStatement x=con.getConnection().prepareStatement("UPDATE `addproduct` SET `minsellqty`=? WHERE productid=?");			
			x.setInt(1,y);
			x.setInt(2,id);
			x.executeUpdate();	
		}
		home first=new home();
		first.option();
}
	}	
