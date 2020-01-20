package shopping;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Remove {
	Connectionm con=new Connectionm();
	public void removee() throws SQLException, ClassNotFoundException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("id to be deleted");
		int id=s.nextInt();
		PreparedStatement st=con.getConnection().prepareStatement("delete from addproduct where productid=?");
		st.setInt(1,id);
		st.executeUpdate();
		System.out.println("Successfully Removed");	
		Choice first=new Choice();
		first.choice();
	}

}
