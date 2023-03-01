package com.school.mng;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
public class AccountantClass
{	
		public void Accountant() throws SQLException, ClassNotFoundException
		{
		
		//System.out.println();
		//connecting to the database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management_system", "root","");
		Statement st=conn.createStatement();
		System.out.println("\n-----------------------------------------------------------Library Department---------------------------------------------\n");
		System.out.println("1 . Manage the Student and their fees :");
		System.out.println();
		System.out.println("2 . Manage the Employees and their slaries :");
		System.out.println("3 . Exit :");
		System.out.println();
		boolean back=false;
		System.out.println("Enter your choice : \n ");
		Scanner sc=new Scanner(System.in);
		int choice1=sc.nextInt();
		
		 switch(choice1)
		 {
		 case 1 :
			 System.out.println("1. Insert the new student :");
			 System.out.println("2. show  the all student details :");
			 System.out.println("3. show the detail of  student who have not pay the fees :");
			 System.out.println("");
			 System.out.println("----------------------------------------------------------------------------------------------------------------");
			 System.out.println();
			 System.out.println("Enter your choice : \n");
			 int choice2=sc.nextInt();
			 switch(choice2)
			 {
			 case 1 :
				 	System.out.println("Enter the roll no of the student : ");
				 	int rollno=sc.nextInt();
				 	sc.nextLine();
				 	System.out.println("\nEnter the name  of the student : ");
				 	String name=sc.nextLine();
				 	System.out.println("\nEnter the class of the student : ");
				 	String cls=sc.nextLine();
				 	System.out.println("\nEnter mobile number  of the student : ");
				 	long mobile=sc.nextLong();
				 	sc.nextLine();
				 	System.out.println("\nEnter the Address pf the student : ");
				 	String add=sc.nextLine();
				 	System.out.println("\nEnter the fees of student :");
				 	double fees=sc.nextDouble();
				 	st.executeUpdate("insert into  student values  ("+rollno+",'"+name+"','"+cls+"',"+mobile+",'"+add+"',"+fees+")");
				 	System.out.println("record inserted successfully......");
				 	conn.close();
				 	break;
			 case 2 :
				 	String sql="select * from  student";
				 	ResultSet rs=st.executeQuery(sql);
				 	while(rs.next())
				 	{
				 		System.out.println("\tRollno : "+rs.getInt(1)+"\tName : "+rs.getString(2)+"\tClass : "+rs.getString(3)+"\tMobile : "+rs.getLong(4)+"\tAddress : "+rs.getString(5)+"\tfess : "+rs.getDouble(6));
				 	}
				 break;
			 case 3 :
				 String qry="select * from  student where fees='"+0+"'";
				 	ResultSet rs1=st.executeQuery(qry);
				 	while(rs1.next())
				 	{
				 		System.out.println("Rollno :"+rs1.getInt(1)+"Name : "+rs1.getString(2)+"Class :"+rs1.getString(3)+"Mobile :"+rs1.getLong(4)+"Address :"+rs1.getString(5)+"fess :"+rs1.getDouble(6));
				 	}
				 break;
				 	
			 }
		 case 2 :
			 System.out.println("1. show the salary of specified Employee :");
			 System.out.println("2. update the employee salary :");
			 System.out.println("Enter your choice : \n");
			 int choice4=sc.nextInt();
			 switch(choice4)
			 {
			 case 1 :
			 			System.out.println("Enter the Employee ID :");
			 			int id=sc.nextInt();
			 			String qry = "\"select * from teacher where t_id='"+id+"'";
			 			ResultSet rs =  st.executeQuery(qry);
			 			while(rs.next())
					 	{
					 		System.out.println("\tTeacher ID : "+rs.getInt(1)+"\tName : "+rs.getString(2)+"\tAddress : "+rs.getString(3)+"\tMobile : "+rs.getLong(4)+"\tSpecialization : "+rs.getString(5)+"\tdepartment : "+rs.getDouble(6)+"\tSalary : "+rs.getString(7));
					 	}
					 break;
			 		
			 case 2 :
				 		System.out.println("Enter the ID of employee to change for salary :");
				 		String id1=sc.nextLine();
				 		System.out.println("Enter salary to be change :");
				 		String sal=sc.nextLine();
				 		String qry1="update teacher set salary='"+sal+"' where t_id='"+id1+"'";
				 		st.executeUpdate(qry1);
				 		break;
			 }
		 case 3 :
			 		back=false;
			 		break;
			 default : System.out.println("You have incorrect choice");
			 
		 }
}
}
	
		
