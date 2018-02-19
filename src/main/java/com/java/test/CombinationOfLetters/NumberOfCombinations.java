package com.java.test.CombinationOfLetters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.java.test.CombinationOfLetters.Utils.Constants;
import com.java.test.CombinationOfLetters.Utils.StringUtils;

public class NumberOfCombinations {

	public static void main(String[] args) {
		NumberOfCombinations obj = new NumberOfCombinations();
		String keys = obj.readInputs();

		System.out.println(obj.printCombinations(keys));

	}

	public String printCombinations(String input) {
		String valid = validation(input);
		if (valid.isEmpty()) {
			Map<Character, String> map = getCharacters();

			List<String> finalList = new ArrayList<String>();
			
			finalList.add("");

			for (int i = 0; i < input.length(); i++) {
				List<String> temp = new ArrayList<String>();
				for (String str : finalList) {
					String letters = map.get(input.charAt(i));
					for (int j = 0; j < letters.length(); j++)
						temp.add(str + letters.charAt(j));
				}
				finalList = temp;
			}
			return finalList.stream().collect(Collectors.joining(" "));
		} else {
			return valid;
		}
	}

	/**
	 * @param keys
	 * @return String as per input
	 */
	private String validation(String input) {
		if (input.isEmpty()) {
			return Constants.NON_EMPTY_ERROR_MSG;
		} else if (!StringUtils.validateInput(input)) {
			return Constants.ERROR_MSG;
		}
		return "";
	}

	private Map<Character, String> getCharacters() {
		Map<Character, String> map = new HashMap<Character, String>();
		map.put('0', "");
		map.put('1', "");
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		return map;
	}

	private String readInputs() {
		System.out.println(Constants.REQUEST_INPUT);
		String input;
		try(Scanner sc = new Scanner(System.in)){
			input = sc.nextLine();
		}
		return input;
	}

}