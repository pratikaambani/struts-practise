package com.java.action;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ModelDriven;
import com.java.model.User;
import com.java.service.*;

//public class LoginAction implements Action {
public class LoginAction extends ActionSupport implements ModelDriven<User> {
	private String userID, password;
	
	//way2
	private User user = new User();
	
	
	
//	private String SUCCESS = "success";
//	private String ERROR = "error";
	
	//Struts2 validation remove comments after testing	
/*    public void validate() {
    	if (StringUtils.isEmpty(getUserID())) {
    		addFieldError("userID", "uID can not be blank");
    	}
    	if (StringUtils.isEmpty(getPassword())) {
    		addFieldError("password", "pw can not be blank");
    	}
    }*/

	public String execute() {
    	
    	LoginService ls = new LoginService();
    	
    	//way1
//  	user = new User();
//    	user.setUserID(userID);
//    	user.setPassword(password);
    	
    	boolean verifyUser = ls.verifyUser(user);
		if(verifyUser) {
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
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
