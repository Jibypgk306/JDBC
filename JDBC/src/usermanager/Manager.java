package usermanager;

import java.sql.SQLException;
import java.util.Scanner;


public class Manager {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Manager ma=new Manager();
		ma.choice();
	}
	public void choice() throws ClassNotFoundException, SQLException
	{
		Conc con=new Conc();
		Scanner s=new Scanner(System.in);
		System.out.println("1)Insert\n2)Login\n3)Exit");
		System.out.println("enter the choice");
		int n=s.nextInt();
		switch(n) {
		case 1:
		Insert insert=new Insert();
		insert.ins();
		break;
		case 2:
		Login log=new Login();
		log.logg();
		break;
}
}
}