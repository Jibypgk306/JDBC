package bankmanagementsystem;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.mysql.jdbc.PreparedStatement;
public class Adduser {
public void userdetails() throws SQLException,ClassNotFoundException
{
bankconnection con=new bankconnection();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the account number:");
int accno=sc.nextInt();
System.out.println("Enter the name:");
String uname=sc.next();
System.out.println("Enter the age:");
int uage=sc.nextInt();
System.out.println("Enter the place:");
String uplace=sc.next();
System.out.println("Enter the adhar number:");
String uproofnumber=sc.next();
PreparedStatement ps=(PreparedStatement) con.getConnection().prepareStatement("insert into userdetail(accno,name,age,place,proofid)values(?,?,?,?,?);");
   ps.setInt(1,accno);
ps.setString(2,uname);
ps.setInt(3,uage);
ps.setString(4,uplace);
ps.setString(5,uproofnumber);
ps.executeUpdate();
   con.getConnection().close();
System.out.println("---------Successfully created the account----------");
adminhome pd=new adminhome();
pd.option1();
}
}








