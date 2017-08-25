package com.priya.CrackingTheCodingInterview;

import java.util.ArrayList;

public class StringHasUniqueCharecters {

	private static boolean stringUniquenessCheck(String string) {

		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j))
					return false;
			}
		}

		return true;
	}

	private static boolean stringUniquenessCheckWithList(String string) {
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			if (list.indexOf(string.charAt(i)) == -1)
				list.add(string.charAt(i));
			else
				return false;

		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(stringUniquenessCheckWithList(AcceptInputs.acceptInputsAsString()));

	}

}
