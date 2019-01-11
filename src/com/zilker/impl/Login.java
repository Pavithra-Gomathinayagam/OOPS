package com.zilker.impl;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;

public class Login {
	private static Logger logger=Logger.getLogger(Login.class.getName());
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Login login=new Login();
		String user_name;
		String user_password;
		
		logger.log(Level.INFO,"Enter the username and password");
		user_name=sc.next();
		user_password=sc.next();
		logger.log(Level.INFO,"Enter the choice");
		logger.log(Level.INFO,"1.Google");
		logger.log(Level.INFO,"2.Facebook");
		logger.log(Level.INFO,"3.Youtube");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:Google google=new Google();
				google.login(user_name,user_password);
				break;
				
			case 2:Facebook facebook=new Facebook();
					facebook.login(user_name, user_password);
				break;
				
			case 3:Youtube youtube=new Youtube();
					youtube.login(user_name, user_password);
				break;
				
			default:
				logger.log(Level.INFO,"Invalid choice");
				
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
