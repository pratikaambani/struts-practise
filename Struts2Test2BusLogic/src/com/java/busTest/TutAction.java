package com.java.busTest;

import com.java.service.TestService;

public class TutAction {

	private String orderedFood;
	private String quality;

	/**
	 * @return the orderedFood
	 */
	public String getOrderedFood() {
		return orderedFood;
	}

	/**
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * @param quality
	 *            the quality to set
	 */
	public void setQuality(String quality) {
		this.quality = quality;
	}

	/**
	 * @param orderedFood
	 *            the orderedFood to set
	 */
	public void setOrderedFood(String orderedFood) {
		this.orderedFood = orderedFood;
	}

	public String execute() {

		TestService ts = new TestService();

		// Using property tag in jsp by getters/setters
		setOrderedFood(ts.getSomeFoodForMe(getQuality()));

		// In console
		String orderedFood = ts.getSomeFoodForMe(getQuality());
		System.out.println("Food in console = " + orderedFood);

		String qualityOfFood = ts.getSomeFoodForMe(getQuality());
		System.out.println("qualityOfFood in console = " + qualityOfFood);

		System.out.println("getOrderedFood = " + getOrderedFood());
		System.out.println("getQuality = " + getQuality());

		return "success";
	}
}
