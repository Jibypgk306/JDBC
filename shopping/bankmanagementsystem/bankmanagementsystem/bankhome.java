package bankmanagementsystem;
import java.sql.SQLException;
import java.util.Scanner;
public class bankhome {
public static void main(String args[])throws ClassNotFoundException, SQLException
	{
		bankconnection con=new bankconnection();
		
		bankhome op=new bankhome();
		op.option1();
	}
		
		public static void option1() throws SQLException,ClassNotFoundException
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("1)ADMIN LOGIN");
		System.out.println("2)USER LOGIN");
		System.out.println("3)STAFF LOGIN");
		System.out.println("4)LOGOUT");
		System.out.println("Enter the choice:");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
		{
		bankadmin insert=new bankadmin();
		insert.adminlogin();
		break;
		}
		case 2:
		{
		bankuser login=new bankuser();
		login.userlogin();
		}
		break;
		case 3:
		{
		stafflogin staff=new stafflogin();
		staff.staffuser();
		}
		break;
		case 4:
		{
	    System.out.println("Successfully Logout!!!!");
		System.exit(0);
				}
		break;
		default :
		System.out.println("Invalid option");
		break;
		}
		
		}
		}
