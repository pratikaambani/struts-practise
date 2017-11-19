package com.java.service;

import com.java.model.*;

public class LoginService {

	public boolean verifyUser(User user) {
		
		String a = user.getUserID();
		String b = user.getPassword();
		System.out.println("a = " +a+ " and b = " +b);
		
		if(user.getUserID().equalsIgnoreCase("Pratik") && user.getPassword().equals("Ambani")) {
			return true;
		}
		return false;
	}
}
