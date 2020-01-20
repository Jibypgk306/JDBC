package bankmanagementsystem;
import java.sql.SQLException;
import java.util.Scanner;

public class adminhome {
public static void main(String args[])throws ClassNotFoundException, SQLException
{
bankconnection con=new bankconnection();

adminhome op=new adminhome();
op.option1();
}

public static void option1() throws SQLException,ClassNotFoundException
{
     Scanner sc=new Scanner(System.in);
System.out.println("1)ADD USER");
System.out.println("2)DISPLAY THE USER DETAILS");
System.out.println("3)UPDATE THE USER DETAILS");
System.out.println("4)VIEW BALANCE");
System.out.println("5)LOGOUT");
System.out.println("Enter the choice:");
int n=sc.nextInt();
switch(n)
{
case 1:
{
Adduser insert=new Adduser();
insert.userdetails();
break;
}
case 2:
{
displayuser view=new displayuser();
view.userdisplay();
}
break;
case 3:
{
   updateuser view=new updateuser();
view.userupdate();
}
case 4:
{
	adviewbal see=new adviewbal();
	see.adview();
}
break;
case 5:
{
	bankhome op=new bankhome();
	op.option1();
}

break;
default :
System.out.println("Invalid option");
break;
}

}
}
