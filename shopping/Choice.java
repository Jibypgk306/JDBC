package shopping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Choice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connectionm con=new Connectionm();
		
		Choice first=new Choice();
		first.choice();
	}
		public void choice() throws ClassNotFoundException, SQLException {
			Scanner s=new Scanner(System.in);
			System.out.println("1)Admin login\n2)Agent login\n3)Exit");
			System.out.println("enter the choice");
			int n=s.nextInt();
			switch(n) {
			case 1:
			adminlogin a=new adminlogin();
			a.log();
			break;
			case 2:
				agentlogin b=new agentlogin();
				b.logg();
			break;
			case 3:
				System.exit(0);
				break;
	}
}
}
