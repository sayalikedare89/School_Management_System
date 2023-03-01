package com.school.mng;
import java.io.Console;
import java.util.*;
public class Welcome {
	public void Welcome() throws Exception
	{
	//Printing Welcome message and menu to know who is accessing the system
		
	System.out.println("*******************************************************************************************************");
	System.out.println("\n-------------------------------------------Welcome to Aryabhatt School--------------------------------");
	System.out.println();
	System.out.println("\n*******************************************************************************************************");
	System.out.println();
	System.out.println("Let me know who you are : ");
	System.out.println();
	System.out.println();
	System.out.println("1 . Principle");
	System.out.println("2 . Accountant");
	System.out.println("3 . Cleark");
	System.out.println("4 . Librian");
	System.out.println("5 . Professor");
	System.out.println("6 . Exit");
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------\n");
	
	//Accept the choice using scanner class
	Scanner sc=new Scanner(System.in);
	// Console con = System.console();   
	System.out.println("Enter your choice : \n");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1 :
			 System.out.println("Enter the  security code : \n");
			 Long PrinciplePassword=sc.nextLong(); 
			 if( PrinciplePassword==2000)
			 {
				 PrincipleClass pc=new PrincipleClass();
				 pc.PrincipleClass();
			 }
			 else
				 System.out.println("Please enter valid code : \n");
			break;
	case 2 	:	
			System.out.println("Enter the  security code : \n");
			Long AccountantPassword=sc.nextLong(); 
			if( AccountantPassword==2001)
			 {
				 AccountantClass ac=new AccountantClass();
				 ac.Accountant();
			 }
			 else
				 System.out.println("Please enter valid code : \n");
			break;
			
	case 3 	:	
		System.out.println("Enter the  security code : \n");
		Long ClearkPassword=sc.nextLong(); 
		if( ClearkPassword==2002)
		 {
			 ClearkClass cc=new ClearkClass();
			 cc.ClearkClass();
		 }
		 else
			 System.out.println("Please enter valid code : \n");
		break;		
	case 4 	:	
		System.out.println("Enter the  security code : \n");
		Long LibrianPassword=sc.nextLong(); 
		if( LibrianPassword==2003)
		 {
			 LibrinClass lc=new LibrinClass();
			 lc.LibrinClass();
		 }
		 else
			 System.out.println("Please enter valid code.....................\n");
		break;		
	case 5  :		
		System.out.println("Enter the  security code : \n");
		Long ProfessorPassword=sc.nextLong(); 
		if( ProfessorPassword==2004)
		 {
			 ProfessorClass pc2=new ProfessorClass();
			 pc2.ProfessorClass();
		 }
		 else
			 System.out.println("Please enter valid code : \n");
		break;	
	}
	
}
}

