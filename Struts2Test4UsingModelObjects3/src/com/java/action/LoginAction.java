package com.java.action;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ModelDriven;
import com.java.model.User;
import com.java.service.*;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	private String userID, password;

	private User user = new User();

	public String execute() {

		LoginService ls = new LoginService();

		boolean verifyUser = ls.verifyUser(user);
		if (verifyUser) {
			System.out.println("Success");
			return SUCCESS;
		} else {
			System.out.println("Login Failed...");
			return ERROR;
		}
	}

	@Override
	public User getModel() {
		
		return user;
	}

}
