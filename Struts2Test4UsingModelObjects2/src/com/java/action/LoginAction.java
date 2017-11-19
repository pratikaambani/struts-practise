package com.java.action;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ModelDriven;
import com.java.model.User;
import com.java.service.*;

public class LoginAction extends ActionSupport {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
