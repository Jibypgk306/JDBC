package bankmanagementsystem;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
public class displayuser {

public void userdisplay() throws ClassNotFoundException, SQLException  
{
      bankconnection con=new bankconnection();
Statement s1=(Statement) con.getConnection().createStatement();
ResultSet r=s1.executeQuery("select * from userdetail");
while(r.next())
{
System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4)+" "+r.getString(5)+" "+r.getString(6));


}
adminhome pd=new adminhome();
pd.option1();
}
}

