package bankmanagementsystem;

import java.sql.SQLException;
import java.util.Scanner;

import bankmanagementsystem.bankconnection;
public class userhome
{
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	bankconnection con=new bankconnection();
	userhome first=new userhome();
	first.option1();
}
		public void option1() throws ClassNotFoundException, SQLException
		{
		Scanner s=new Scanner(System.in);
		System.out.println("1)DEPOSIT\n2)WITHDRAW AMOUNT\n3)VIEW BALANCE\n4)LOGOUT");
		System.out.println("Enter the choice:");
		int n=s.nextInt();
		switch(n){
		case 1:
		addmoney bu=new addmoney();
		bu.money();
		break;
		case 2:
		addmoney v=new addmoney();
		v.withdraww();
		break;
		case 3:
		viewbal b=new viewbal();
		b.viewbalance();
		break;
		case 4:
			
		System.out.println("Logout Successfully..");
		System.out.println("Thank you...Visit Again.....");
		bankhome op=new bankhome();
		op.option1();
	}
}
}
