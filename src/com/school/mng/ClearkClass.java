package com.school.mng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClearkClass {

	public void ClearkClass() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management_system", "root","");
		Statement st=conn.createStatement();
		// TODO Auto-generated method stub
		System.out.println("\n-----------------------------------------------------------Clerk Department---------------------------------------------\n");
		System.out.println("1 . Manage Teacher");
		System.out.println("2 . Manage Course");
		System.out.println("3 . Show the teacher attendance.");
		 System.out.println("4. Exit :");
		 boolean exit=false;
		System.out.println("Enter your choice : \n ");
		Scanner sc=new Scanner(System.in);
		int choice1=sc.nextInt();

		 switch(choice1)
		 {
		 case 1 :
			 System.out.println("1. Insert the new Teacher :");
			 System.out.println("2. show  the all Teacher details :");
			 System.out.println("");
			 System.out.println("----------------------------------------------------------------------------------------------------------------");
			 System.out.println();
			 System.out.println("Enter your choice : \n");
			 int choice2=sc.nextInt();
			 switch(choice2)
			 {
			 case 1 :
				 	System.out.println("Enter the Teacher ID : ");
				 	int tid=sc.nextInt();
				 	sc.nextLine();
				 	System.out.println("\nEnter the name of the teacher : ");
				 	String tname=sc.nextLine();
				 	System.out.println("\nEnter the Address pf the teacher : ");
				 	String add=sc.nextLine();
				 	System.out.println("\nEnter mobile number  teachert : ");
				 	long mobile=sc.nextLong();
				 	sc.nextLine();
				 	System.out.println("\nEnter the Specialization : ");
				 	String special=sc.nextLine();
				 	
				 	System.out.println("\nEnter the department :");
				 	String depart=sc.nextLine();
				 	sc.nextLine();
				 	System.out.println("\nEnter the Salary : ");
				 	String sal=sc.nextLine();
					st.executeUpdate("insert into  teacher values  ("+tid+",'"+tname+"','"+add+"',"+mobile+",'"+special+"','"+depart+"','"+sal+"')");
				 	System.out.println("record inserted successfully......");
				 	conn.close();
				 	break;
			 case 2 :
				 String sql="select * from  teacher";
				 	ResultSet rs=st.executeQuery(sql);
				 	while(rs.next())
				 	{
				 		System.out.println("\tTeacher ID : "+rs.getInt(1)+"\tName : "+rs.getString(2)+"\tAddress : "+rs.getString(3)+"\tMobile : "+rs.getLong(4)+"\tSpecialization : "+rs.getString(5)+"\tdepartment : "+rs.getDouble(6)+"\tSalary : "+rs.getString(7));
				 	}
				 break;
			default : System.out.println("Please select proper choice..");	 
				 	
			 }
		 case 2 :
			 System.out.println("1. Add new course :");
			 System.out.println("2. show  course information:");
			 System.out.println("");
			 System.out.println("----------------------------------------------------------------------------------------------------------------");
			 System.out.println();
			 System.out.println("Enter your choice : \n");
			 int choice3=sc.nextInt();
			 switch(choice3)
			 {
			 case 1 :
				 		System.out.println("Enter Course ID : ");
				 		int cid=sc.nextInt();
				 		sc.nextLine();
				 		System.out.println("\nEnter course name : ");
				 		String cname=sc.nextLine();
				 		System.out.println("Enter establish year :");
				 		String dt=sc.nextLine();
				 		
				 		st.executeUpdate("insert into  course values  ("+cid+",'"+cname+"','"+dt+")");
					 	System.out.println("record inserted successfully......");
					 	conn.close();
					 	break;
			 case 2 :
				 	String sql="select * from  course";
				 	ResultSet rs=st.executeQuery(sql);
				 	while(rs.next())
				 	{
				 		System.out.println("\t Course ID : "+rs.getInt(1)+"\tCourse Name : "+rs.getString(2)+"\tEstablish year : "+rs.getString(3));
				 	}
				 	break;
			 default : System.out.println("Please select proper choice..");	 
				 	
			 }
		 case 3 :
			 	System.out.println("Enter Teacher ID : ");
		 		int tid=sc.nextInt();
		 		sc.nextLine();
		 		System.out.println("Enter total number of days present in month :");
		 		int tno_of_day_present=sc.nextInt();
			 	
		 		st.executeUpdate("insert into  techer_attendance values  ("+tid+","+tno_of_day_present+")");
			 	System.out.println("record inserted successfully......");
			 	conn.close();
			 	break;
		 case 4 : exit=false;
		 break;
		 default :
			 		System.out.println("You may have entered incorrect choice : ");
		 }
	}

}
