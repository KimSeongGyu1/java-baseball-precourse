package domain;

import java.util.List;
import java.util.stream.IntStream;

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
	
	public int getExactMatchingCounts(GameNumbers input) {
		return (int) IntStream.range(0, NUM_OF_NUMBERS)
		.filter(i -> input.getNumbers().get(i) == this.gameNumbers.get(i))
		.count();
	}
	
	public int getOverlappingCounts(GameNumbers input) {
		return (int) input.getNumbers().stream()
				.filter(num -> this.gameNumbers.contains(num))
				.count();
	}
}
