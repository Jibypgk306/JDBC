package bankmanagementsystem;

import java.sql.SQLException;
import java.util.Scanner;

public class staffhome {
	
		// TODO Auto-generated method stub
		public static void main(String args[])throws ClassNotFoundException, SQLException
		{
		bankconnection con=new bankconnection();

		staffhome op=new staffhome();
		op.staffuser();
		}

		public static void staffuser() throws SQLException,ClassNotFoundException
		{
		     Scanner sc=new Scanner(System.in);
		     System.out.println("1)ADD USER");
		     System.out.println("2)DISPLAY THE USER DETAILS");
		     System.out.println("3)LOGOUT");
		     System.out.println("Enter the choice:");
		     int n=sc.nextInt();
		     switch(n)
		     {
		     case 1:
		     {
		        staffadd user=new staffadd();
		        user.staffuseradd();
		     }
		     break;
		     case 2 :
		     {
		    	 userdisplay staff=new userdisplay();
		    	 staff.userdisplay();
		     }
		     break;
		     case 3:
		     {
		    	 bankhome op=new bankhome();
		 		op.option1();
	}

		
}
		}
}