package shopping;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Add 
{
	Connectionm con=new Connectionm();

	public void addd1() throws SQLException, ClassNotFoundException 
	{	
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the Product id");
	int id=s.nextInt();
	System.out.println("Enter the Product name");
	String name=s.next();
	System.out.println("Enter the Quantity");
	int qty=s.nextInt();
	System.out.println("Enter the Price");
	int price=s.nextInt();
	PreparedStatement stt=con.getConnection().prepareStatement("INSERT INTO addproduct(productid, productname, minsellqty,price) VALUES (?,?,?,?)");
	stt.setInt(1, id);
	stt.setString(2,name);
	stt.setInt(3, qty);
	stt.setInt(4, price);
	stt.executeUpdate();
	System.out.println("Product Added Successfully");
	home first=new home();
	first.option();
	}
}