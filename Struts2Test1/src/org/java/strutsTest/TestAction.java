package org.java.strutsTest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.Action;

public class TestAction implements Action {
	// public class TestAction extends ActionSupport implements Action,
	// ActionInvocation, ActionProxy, ActionMapper, ResourceBundleTextProvider,
	// Validateable, ValidationAware, {

	// Control Tags
	private List<String> listInAction = new ArrayList<String>();

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getListInAction() {
		return listInAction;
	}

	public void setListInAction(List<String> listInAction) {
		this.listInAction = listInAction;
	}

	// Data Tags
	public Date customDate;
	private String propertyEx = "Using property tag <-- This value is from action";
	private String sampleString = "My Name is Pratik";


	public String getSampleString() {
		return sampleString;
	}

	public void setSampleString(String sampleString) {
		this.sampleString = sampleString;
	}

	public String getPropertyEx() {
		return propertyEx;
	}

	public void setPropertyEx(String propertyEx) {
		this.propertyEx = propertyEx;
	}

	public Date getCustomDate() {
		return customDate;
	}

	public void setCustomDate(Date customDate) {
		this.customDate = customDate;
	}

	public String execute() {

		System.out.println("Bingo!! We are inside Action Class finally.");
		System.out.println("Hiiiiiii -> " + System.nanoTime());

		userName = "Pratik";

		listInAction = new ArrayList<>();
		listInAction.add("P");
		listInAction.add("R");
		listInAction.add("A");
		listInAction.add("T");
		listInAction.add("I");
		listInAction.add("K");

		Calendar cal = Calendar.getInstance();
		cal.set(2015, 4, 22, 15, 15, 15);

		Date d = cal.getTime();

		setCustomDate(d);

		return "success";
	}

}
