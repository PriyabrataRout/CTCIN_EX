package com.priya.CrackingTheCodingInterview;

public class URLify {

	private static void decodeUrl(String str) {

		String[] stringArr = str.trim().split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < stringArr.length; i++) {
			builder.append(stringArr[i]);
			if (i < stringArr.length - 1)
				builder.append("%20");

		}
		System.out.println(builder);
	}

	public static void main(String[] args) {
		decodeUrl("Mr Priyabrata Rout ");

	}

}
