package domain;

import java.util.List;

public class GameNumbers {
	private static final int NUM_OF_NUMBERS = 3;
	
	private List<Integer> gameNumbers;
	
	public GameNumbers(List<Integer> input) {
		checkValidInput(input);
		this.gameNumbers = input;
	}
	
	private void checkValidInput(List<Integer> input) {
		checkValidLength(input);
		checkOverlapping(input);
	}
	
	private void checkValidLength(List<Integer> input) {
		if (input.size() != NUM_OF_NUMBERS) {
			throw new IllegalArgumentException("3자리의 숫자를 입력해 주세요");
		}
	}
	
	private void checkOverlapping(List<Integer> input) {
		if (input.stream().distinct().count() != input.size()) {
			throw new IllegalArgumentException("중복되지 않은 숫자를 입력해주세요");
		}
	}
	
	public List<Integer> getNumbers() {
		return this.gameNumbers;
	}
}
