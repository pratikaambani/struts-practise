package com.java.action;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ModelDriven;
import com.java.model.User;
import com.java.service.*;

public class LoginAction extends ActionSupport {
	private String userID, password;

	public String execute() {

		LoginService ls = new LoginService();

		User user;
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

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
