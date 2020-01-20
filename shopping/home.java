package shopping;

import java.sql.SQLException;
import java.util.Scanner;

public class home {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connectionm con=new Connectionm();
		home1 first=new home1();
		first.option1();
	}public void option() throws ClassNotFoundException, SQLException
	{
		Scanner s=new Scanner(System.in);
	System.out.println("1)Add product\n2)Display\n3)Remove\n4)Update\n5)exit");
	System.out.println("enter the choice");
	int n=s.nextInt();
	switch(n) {
	case 1:
	Add add=new Add();
	add.addd1();
	break;
	case 2:
	Display display =new Display();
	display.displayy();
	break;
	case 3:
		Remove remove =new Remove();
		remove.removee();
		break;
	case 4:
		Update up=new Update();
		up.upp();
	case 5:
		System.out.println("Logout Successfully");
		Choice first=new Choice();
		first.choice();
	}
	

}
}