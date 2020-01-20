package shopping;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Update 
{
	Connectionm con=new Connectionm();

	public void upp() throws ClassNotFoundException, SQLException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the  id to update");
		int id1=s.nextInt();
		System.out.println("enter the  id");
		int id=s.nextInt();
		System.out.println("Enter the Product name");
		String name=s.next();
		System.out.println("Enter the Quantity");
		int qty=s.nextInt();
		System.out.println("Enter the Price");
		int price=s.nextInt();
		PreparedStatement st=con.getConnection().prepareStatement("UPDATE `addproduct` SET `productid`=?,`productname`=?,`minsellqty`=?,`price`=? WHERE productid=?");
		st.setInt(1,id);
		st.setString(2, name);
		st.setInt(3, qty);
		st.setInt(4,price);
		st.setInt(5,id1);//update id
		st.executeUpdate();
		System.out.println("updated successfully");
		home first=new home();
		first.option();
	}
}