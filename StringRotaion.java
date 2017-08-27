package com.priya.CrackingTheCodingInterview;

public class StringRotaion {
	private static boolean isSubstring(String str1, String str2) {
		return str1.contains(str2);
	}

	private static boolean isARotaion(String parentString, String childString) {
		if (parentString.equalsIgnoreCase(childString))
			return true;

		int rotationIndex = -1;

		for (rotationIndex = 0; rotationIndex < parentString.length(); rotationIndex++) {
			if (parentString.charAt(rotationIndex) == childString.charAt(0))
				break;
		}

		if (isSubstring(childString, parentString.substring(rotationIndex)))
			if (childString
					.equalsIgnoreCase(parentString.substring(rotationIndex) + parentString.substring(0, rotationIndex)))
				return true;
		return false;
	}

	private static boolean isARotaionInSimplerWay(String parentString, String childString) {
		if (parentString.length() != childString.length())
			return false;

		return isSubstring(parentString + parentString, childString);

	}

	public static void main(String[] args) {
		System.out.println(isARotaionInSimplerWay("waterbottle", "bottlewater"));

	}

}
