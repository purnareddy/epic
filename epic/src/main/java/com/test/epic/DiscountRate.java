package com.test.epic;

public class DiscountRate {

	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;

	public static double getServiceDiscountRate(String memberType) {
		if (memberType == "premium") {
			return serviceDiscountPremium;
		} else if (memberType == "gold") {
			return serviceDiscountGold;
		} else if (memberType == "silver") {
			return serviceDiscountSilver;
		} else {
			return 0;
		}
	}

	public static double getProductDiscountRate(String memberType) {
		if (memberType == "premium") {
			return productDiscountPremium;
		} else if (memberType == "gold") {
			return productDiscountGold;
		} else if (memberType == "silver") {
			return productDiscountSilver;
		} else {
			return 0;
		}
	}

}
