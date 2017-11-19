package com.java.service;

public class TestService {
	
	public String getSomeFoodForMe(String quality) {
		if(quality.equalsIgnoreCase("veg")) {
			return "Aalu Parathas";
		} else if(quality.equalsIgnoreCase("nonveg")) {
			return "Chicken Biryani";
		} else {
			return "Khana kya chaahte ho !!";
		} 
	}

}
