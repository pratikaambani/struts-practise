package com.javatpoint;


public class Login {

	private String name, password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	String execute() {
		if (name.equalsIgnoreCase("pratik")) {
			return "success";
		} else {
			return "error";
		}
	}
}
