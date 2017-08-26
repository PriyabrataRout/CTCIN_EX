package com.priya.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map.Entry;

public class OneWay {

	private static HashMap<Character, Integer> returnCounterMap(String string) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			} else
				map.put(string.charAt(i), 1);
		}
		System.out.println(map);
		return map;
	}

	private static boolean initiate(String str1, String str2) {
		HashMap<Character, Integer> firstMap = returnCounterMap(str1);
		HashMap<Character, Integer> secondMap = returnCounterMap(str2);
		int validateCounter = 0;
		for (Entry<Character, Integer> entry : firstMap.entrySet()) {
			if (validateCounter > 1)
				return false;

			if (secondMap.containsKey(entry.getKey())) {
				if ((entry.getValue() - secondMap.get(entry.getKey())) > 1)
					validateCounter += 1;
			} else
				validateCounter += entry.getValue();

		}

		return true;
	}

	private static void oneWayCheck(String str1, String str2) {
		boolean isValid;
		if (str1.length() < str2.length())
			isValid = initiate(str2, str1);
		else
			isValid = initiate(str1, str2);
		System.out.println(isValid);
	}

	public static void main(String[] args) {

		oneWayCheck("PALDE", "PAEDS");
	}

}
