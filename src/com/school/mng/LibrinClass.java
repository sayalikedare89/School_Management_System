package com.school.mng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibrinClass {

	public void LibrinClass() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management_system", "root","");
		Statement st=conn.createStatement();
		// TODO Auto-generated method stub
		System.out.println("\n-----------------------------------------------------------Library Department---------------------------------------------\n");
		System.out.println("1 . All Books");
		System.out.println("2 . Search book by class");
		System.out.println("3 . Inser new Book");
		System.out.println("\n ---------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Enter your choice : \n ");
		Scanner sc=new Scanner(System.in);
		int choice1=sc.nextInt();
		ResultSet rs;
		boolean exit=false;
		 switch(choice1)
		 {
		 case 1 :
			 	String sql="select * from  book";
			 	 rs=st.executeQuery(sql);
			 	while(rs.next())
			 	{
			 		System.out.println("\tISBN : "+rs.getString(1)+"\tName : "+rs.getString(2)+"\tClass : "+rs.getString(3));
			 	}
			 break;
		 case 2 :
			 	System.out.println("Enter the Class : ");
			 	String cls=sc.nextLine();
			 	String qry="select * from  book where class='"+cls+"'";
			 	 rs=st.executeQuery(qry);
			 	while(rs.next())
			 	{
			 		System.out.println("\tISBN : "+rs.getString(1)+"\tName : "+rs.getString(2)+"\tClass : "+rs.getString(3));
			 	}
			 break;
		 case 3 :
			 	System.out.println("\nEnter ISBN number  : ");
			 	String isbn=sc.nextLine();
			 	sc.nextLine();
			 	System.out.println("\nEnter the name of bookt : ");
			 	String name=sc.nextLine();
			 	sc.nextLine();
			 	System.out.println("\nEnter class : ");
			 	String cls1=sc.nextLine();
			 	sc.nextLine();
			 	st.executeUpdate("insert into  book values  ('"+isbn+"','"+name+"','"+cls1+"'");
			 	System.out.println("record inserted successfully......");
			 	conn.close();
			 	break;
		 case 4 :	 	
			 		exit=false;
		default : System.out.println("Enter valid choice...");	 		
		 }
}

}
