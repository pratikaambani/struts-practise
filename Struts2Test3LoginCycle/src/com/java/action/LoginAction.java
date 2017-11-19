package com.java.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Validateable;

//public class LoginAction implements Action {

public class LoginAction extends ActionSupport implements Validateable {
	private String userID, password;

	private String SUCCESS = "success";
	private String ERROR = "error";

	// Struts2 validation remove comments after testing
	// Validation framework used, check LoginAction-validation.xml

	public void validate() {
		if (StringUtils.isEmpty(getUserID())) {
			addFieldError("userID", getText("errmsg1"));
		}
		if (StringUtils.isEmpty(getPassword())) {
			addFieldError("password", "pw can not be blank");
		}
	}

	public String execute() {
		System.out.println("Inside execute()");
		if (getUserID().equalsIgnoreCase("Pratik") && getPassword().equals("Ambani")) {
			System.out.println("Success");
			return SUCCESS;
		} else {
			System.out.println("Login Failed...");
			return ERROR;
		}
	}

	public String testMethod() {
		// Specifying method name in action tag executes specific method
		System.out.println("testMethod() executed");
		return "SUCCESS123";
	}

	public String workingMethod() {
		// Specifying method name in action tag executes specific method
		System.out.println("workingMethod() executed");
		return "SUCCESS123";
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
