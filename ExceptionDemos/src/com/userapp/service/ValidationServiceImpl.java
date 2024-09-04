package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		
		if(password.length()<6) {
			throw new TooLongException("password is TooShort");
		}else if(password.length()>15) {
			throw new TooLongException("password is Too long");
		}
		return true;
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usernames = {"Sri","Priya","Joe","Kathy"};
		boolean flage=false;
		for (String name : usernames) {
			if(name.equals(username)) 
				throw new NameExistsException("Name already exists");
			flage=true;
		}
		
		return flage;
	}

	
}
