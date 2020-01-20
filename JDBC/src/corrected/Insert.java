package corrected;

import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Insert {
Connectionn con=new Connectionn();

public void ins() throws SQLException, ClassNotFoundException {
Scanner s=new Scanner(System.in);

System.out.println("enter the id");
int id=s.nextInt();
System.out.println("Enter the username");
String name=s.next();
System.out.println("Enter the password");
String pass=s.next();
PreparedStatement st=(PreparedStatement)con.getconnection().prepareStatement("insert into stud(sid,uname,pswd)values(?,?,?)");
st.setInt(1, id);//1 is the index and id set to 1
st.setString(2,name);
st.setString(3, pass);
st.executeUpdate();
System.out.println("data saved");
Firstapp first=new Firstapp();
first.choice();

}



}