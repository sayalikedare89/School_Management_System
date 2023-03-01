package com.school.mng;

import java.sql.SQLException;
import java.util.Scanner;

public class PrincipleClass {
	public void PrincipleClass() throws ClassNotFoundException, SQLException
	{
		System.out.println("\n \n-----------------------------------------------------------Information of all department------------------------------------------------\n\n");
		System.out.println("1 . Accountant");
		System.out.println("2 . Cleark");
		System.out.println("3 . Librian");
		System.out.println("4 . Professor");
		System.out.println("5 . Exit");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		// Console con = System.console();   
		System.out.println("choose following to know more : \n");
		int choice=sc.nextInt();
		boolean back = false;
		switch(choice)
		{
		case 1 :
			AccountantClass ac=new AccountantClass();
			 ac.Accountant();
			 break;
		case 2 :
			ClearkClass cc=new ClearkClass();
			 cc.ClearkClass();
			 break;
		case 3 :
			 LibrinClass lc=new LibrinClass();
			 lc.LibrinClass();
			 break;
		case 4 :
			ProfessorClass pc2=new ProfessorClass();
			 pc2.ProfessorClass();
			 break;
		case 5:
			back = false;
			break;
		}
			
			}
}
