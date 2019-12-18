package inputview;

public class InputParser {
	public static int[] parseStringToIntArr(String input) {
		int[] temp = new int [input.length()];
		for (int i = 0; i < input.length(); i++) {
			checkIfCharIsNum(input.charAt(i));
			temp[i] = Character.getNumericValue(input.charAt(i));
		}
		return temp;
	}
	
	private static void checkIfCharIsNum(char inputChar) {
		if ((inputChar > '9') || (inputChar < '1')) {
			throw new IllegalArgumentException("각 자리에 1에서 9사이의 숫자를 입력해주세요");
		}
	}
}
