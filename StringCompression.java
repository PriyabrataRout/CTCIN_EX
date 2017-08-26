package com.priya.CrackingTheCodingInterview;

public class StringCompression {

	private static void compress(String str) {
		StringBuilder builder = new StringBuilder();
		int counter = 1;

		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i) == str.charAt(i - 1)) {
				counter++;
			} else {
				builder.append(str.charAt(i - 1)).append(counter);
				counter = 1;
			}
			if (i == str.length() - 1)
				builder.append(str.charAt(i)).append(counter);

		}

		System.out.println(builder.toString());
	}

	public static void main(String[] args) {

		compress("aaabbcccaadd");

	}

}
