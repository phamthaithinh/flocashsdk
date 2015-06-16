package com.flocash.sdk.models;

import java.util.ArrayList;
import java.util.List;

public class CustomFieldFactory {
	public static final String OTP = "otp";
	public static final String cardNumber = "cardNumber";
	public static final String expireYear = "expireYear";
	public static final String expireMonth = "expireMonth";
	public static final String cvv = "cvv";
	public static final String mobile = "mobile";

	public static List<CustomField> getCustomFieldMobile() {
		List<CustomField> fields = new ArrayList<CustomField>();
		CustomField mobile = new CustomField();
		mobile.setDisplayName("Mobile Number");
		mobile.setMaxlength(20);
		mobile.setName(CustomFieldFactory.mobile);
		mobile.setMinLength(6);
		mobile.setType(CustomField.Type.DIGIT);
		fields.add(mobile);
		return fields;
	}

	public static List<CustomField> getCustomFieldMobileOTP() {
		List<CustomField> fields = new ArrayList<CustomField>();
		CustomField mobile = new CustomField();
		mobile.setDisplayName("Mobile Number");
		mobile.setMaxlength(20);
		mobile.setName(CustomFieldFactory.mobile);
		mobile.setMinLength(6);
		mobile.setType(CustomField.Type.DIGIT);
		fields.add(mobile);
		CustomField otp = new CustomField();
		otp.setDisplayName("OTP");
		otp.setName(OTP);
		otp.setMaxlength(5);
		otp.setMinLength(5);
		otp.setType(CustomField.Type.DIGIT);
		fields.add(otp);
		return fields;
	}

	public static List<CustomField> getCustomFieldCard() {
		List<CustomField> fields = new ArrayList<CustomField>();
		CustomField otp = new CustomField();
		otp.setDisplayName("OTP");
		otp.setMaxlength(5);
		otp.setName(OTP);
		otp.setMinLength(5);
		otp.setType(CustomField.Type.DIGIT);
		fields.add(otp);
		return fields;
	}

	public static List<CustomField> getCustomFieldOTP() {
		List<CustomField> fields = new ArrayList<CustomField>();
		CustomField otp = new CustomField();
		otp.setDisplayName("OTP");
		otp.setMaxlength(5);
		otp.setMinLength(5);
		otp.setName(OTP);
		otp.setType(CustomField.Type.DIGIT);
		fields.add(otp);
		return fields;
	}
}
