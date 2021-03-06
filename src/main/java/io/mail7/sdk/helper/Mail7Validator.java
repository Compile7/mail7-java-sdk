package io.mail7.sdk.helper;

public class Mail7Validator {
	private Mail7Validator() {
	}

	public static boolean isNullOrWhiteSpace(String str) {
		if (str != null) {
			str = str.trim();
		}
		return str != null && !str.isEmpty() ? false : true;
	}

	public static String getValidationMessage(final String s) {
		return "The " + s + " is a Required Paramter So its can not be null or empty";
	}
}
