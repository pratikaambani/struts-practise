package com.java.action;

import com.java.model.User;
import com.java.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String userID, password;

	private User user;

	public String execute() {

		LoginService ls = new LoginService();
		
		

		// way1
		 user = new User();
		 user.setUserID(userID);
		 user.setPassword(password);

		boolean verifyUser = ls.verifyUser(user);
		if (verifyUser) {
			System.out.println("Success");
			return SUCCESS;
		} else {
			System.out.println("Login Failed...");
			return ERROR;
		}
	}

}
