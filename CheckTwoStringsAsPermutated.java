package com.priya.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map.Entry;

public class CheckTwoStringsAsPermutated {

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

	private static boolean permutationCheck(String str1, String str2) {

		HashMap<Character, Integer> map1 = returnCounterMap(str1);
		HashMap<Character, Integer> map2 = returnCounterMap(str2);

		if (map1.size() != map2.size())
			return false;

		for (Entry<Character, Integer> entry : map1.entrySet()) {
			if (map2.containsKey(entry.getKey())) {
				if (entry.getValue() != map2.get(entry.getKey()))

					return false;
			} else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		String str1 = "BCCA";
		String str2 = "ABCC";
		System.out.println(permutationCheck(str1, str2));
	}

}
