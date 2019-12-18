package inputview;

import java.util.List;
import java.util.ArrayList;

public class InputParser {
	public static List<Integer> parseStringToIntList(String input) {
		List<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			checkIfCharIsNum(input.charAt(i));
			temp.add(Character.getNumericValue(input.charAt(i)));
		}
		return temp;
	}
	
	private static void checkIfCharIsNum(char inputChar) {
		if ((inputChar > '9') || (inputChar < '1')) {
			throw new IllegalArgumentException("각 자리에 1에서 9사이의 숫자를 입력해주세요");
		}
	}
}
