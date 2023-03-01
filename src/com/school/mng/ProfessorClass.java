package com.school.mng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProfessorClass {

	public void ProfessorClass() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management_system", "root","");
		Statement st=conn.createStatement();
		// TODO Auto-generated method stub
		System.out.println("\n-----------------------------------------------------------Techer's Department---------------------------------------------\n");
		System.out.println("1 . Manage student Attendance");
		System.out.println("2 . Manage Syllabus");
		System.out.println("\n ---------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Enter your choice : \n ");
		Scanner sc=new Scanner(System.in);
		int choice1=sc.nextInt();
		ResultSet rs;
		boolean exit=false;
		 switch(choice1)
		 {
		 case 1 :
			 	System.out.println("1 . Insert Student Attendance");
				System.out.println("2 . showh attendance by Specific Student name");
				System.out.println("\n ---------------------------------------------------------------------------------------------------------------------------\n");
				System.out.println("Enter your choice : \n ");
				 sc=new Scanner(System.in);
				int choice2=sc.nextInt();
				//ResultSet rs;
				switch(choice2)
				{
				case 1 :
					 System.out.println("Enter Student  ID : ");
					 int sid=sc.nextInt();
					 sc.nextLine();
					 System.out.println("Enter Name of student : ");
					 String name=sc.nextLine();
					 sc.nextLine();
					 System.out.println("Enter total number of days present in month :");
	 				int tno_of_day_present=sc.nextInt();
	 				st.executeUpdate("insert into  student_atendance values  ("+sid+",'"+name+"',"+tno_of_day_present+")");
	 				System.out.println("record inserted successfully......");
	 				conn.close();
	 				break;
				case 2 :
					String sql="select * from  student_atendance";
				 	 rs=st.executeQuery(sql);
				 	while(rs.next())
				 	{
				 		System.out.println("\tRollno : "+rs.getInt(1)+"\tName : "+rs.getString(2)+"\tNumber of day present:"+rs.getInt(3));
				 	}
				 break;
				}
		 case 2 : 
			 	System.out.println("1 . Insert new activities ");
				System.out.println("2 . show the status of activity");
				System.out.println("\n ---------------------------------------------------------------------------------------------------------------------------\n");
				System.out.println("Enter your choice : \n ");
				 sc=new Scanner(System.in);
				int choice3=sc.nextInt();
				//ResultSet rs;
				switch(choice3)
				{
				
				case 1 :
					System.out.println("Enter the course/class name:");
					String cls=sc.nextLine();
					System.out.println("Enter the activity name :");
					String activity=sc.nextLine();
					System.out.println("Enter the status of the activity:");
					String status=sc.nextLine();
					st.executeUpdate("insert into  syllabus values  ("+cls+",'"+activity+"',"+status+")");
	 				System.out.println("record inserted successfully......");
	 				conn.close();
	 				break;
				case 2 :
					System.out.println("Enter the activity name:");
					String aname=sc.nextLine();
					String sql="select * status from syllabus where activity_name='"+aname+"'";
				 	 rs=st.executeQuery(sql);
				 	while(rs.next())
				 	{
				 		System.out.println("\tRollno : "+rs.getInt(1)+"\tName : "+rs.getString(2)+"\tNumber of day present:"+rs.getInt(3));
				 	}
				 break;
								
				}
		 case 3 :exit=false;
		 break;
					
		 }
	}

}
