package com.zilker.impl;

import com.zilker.constants.Constant;
import com.zilker.dao.LoginInterface;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Youtube implements LoginInterface{
	
	private static Logger logger=Logger.getLogger(Login.class.getName());

	@Override
	public void login(String user_name, String user_password) {
		// TODO Auto-generated method stub
		if(Constant.user_name_verify.equals(user_name)&& Constant.user_password_verify.equals(user_password))
		{
			logger.log(Level.INFO,"Valid");
		}
		else
			logger.log(Level.INFO,"Invalid");
		
		
	}


}
