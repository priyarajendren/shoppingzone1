package com.watches.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public boolean isValidUser(String userName, String password) {
		if(userName.equals("haripriya")&& password.equals(1234))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
		
	}
	


