package jdbc;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import com.mysql.jdbc.Connection;
public class Student {
public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");	
Scanner s=new Scanner(System.in);
System.out.println("Enter Name:");
String name=s.next();
System.out.println("Enter Register number:");
int regno=s.nextInt();
System.out.println("Enter Department Name:");
String dept=s.next();
System.out.println("Enter Year:");
int year=s.nextInt();
System.out.println("Enter Adress:");
String adress=s.next();
PreparedStatement st=con.prepareStatement("INSERT INTO `student`(`name`, `regno`, `dept`, `year`, `adres`) VALUES (?,?,?,?,?)");
st.setString(1, name);
st.setInt(2, regno);
st.setString(3, dept);
st.setInt(4, year);
st.setString(5, adress);
st.executeUpdate();
System.out.println("SUCCESSFUL!!!!");
con.close();
	}
}