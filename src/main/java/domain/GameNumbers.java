package domain;

public class GameNumbers {
	private static final int NUM_OF_NUMBERS = 3;
	
	private int[] gameNumbers;
	
	public GameNumbers(int[] input) {
		checkValidInput(input);
		this.gameNumbers = input;
	}
	
	private void checkValidInput(int[] input) {
		checkValidLength(input);
	}
	
	private void checkValidLength(int[] input) {
		if (input.length != NUM_OF_NUMBERS) {
			throw new IllegalArgumentException("3자리의 숫자를 입력해 주세요");
		}
	}
	
	public int[] getNumbers() {
		return this.gameNumbers;
	}
}
