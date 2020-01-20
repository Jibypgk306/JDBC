package shopping;
import java.sql.SQLException;
import java.util.Scanner;

public class home1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connectionm con=new Connectionm();
		home first=new home();
		first.option();
	}
	public void option1() throws ClassNotFoundException, SQLException
	{
	Scanner s=new Scanner(System.in);
	System.out.println("1)Buy sell\n2)ViewProduct\n3)Logout");
	System.out.println("enter the choice");
	int n=s.nextInt();
	switch(n) {
	case 1:
	Buy bu=new Buy();
	bu.buyy();
	break;
	case 2:
	View v =new View();
	v.vieww();
	break;
	case 3:
	System.out.println("Logout Successfully");
	Choice first=new Choice();
	first.choice();
	}
}
}
