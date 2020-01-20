package bankmanagementsystem;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.jdbc.PreparedStatement;
public class updateuser {
public void userupdate() throws ClassNotFoundException, SQLException{
   bankconnection con=new bankconnection();
Scanner s=new Scanner(System.in);
System.out.println("Enter the account number:");
int id=s.nextInt();
System.out.println("Enter the new name:");
String uname=s.next();
System.out.println("Enter the new age:");
int uage=s.nextInt();
System.out.println("Enter the new place:");
String uplace=s.next();
System.out.println("Enter the new proofid:");
String pid=s.next();
PreparedStatement ps=(PreparedStatement) con.getConnection().prepareStatement("update userdetail set name=?,age=?,place=?,proofid=? where accno=?;");
ps.setString(1,uname);
ps.setInt(2,uage);
ps.setString(3,uplace);
ps.setString(4,pid);
ps.setInt(5,id);
ps.executeUpdate();
con.getConnection().close();
System.out.println("------------------Data updated Successfully----------------");
adminhome pd=new adminhome();
pd.option1();
}
}
