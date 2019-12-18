package domain;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Judge {
	private static final int NUM_OF_NUMBERS = 3;
	private static final int NUM_RANGE = 9;
	private static final int MIN_NUM = 1;
	
	private static Random RANDOM = new Random();
	private GameNumbers judgeNumbers;
	private int strikeCounts = 0;
	private int ballCounts = 0;
	
	public Judge() {
		this.judgeNumbers = createRandNumbers();
	}
	
	private GameNumbers createRandNumbers() {
		List<Integer> randNums = new ArrayList<Integer>();
		while(randNums.size() < NUM_OF_NUMBERS) {
			addIfUnique(randNums, RANDOM.nextInt(NUM_RANGE) + MIN_NUM);
		}
		return new GameNumbers(randNums);
	}

	private void addIfUnique(List<Integer> numbers, int input) {
		if (!numbers.contains(input)) {
			numbers.add(input);
		}
	}
	
	public void checkResult(GameNumbers userNumbers) {
		this.strikeCounts = this.judgeNumbers.getExactMatchingCounts(userNumbers);
		this.ballCounts = this.judgeNumbers.getOverlappingCounts(userNumbers) - this.strikeCounts;
	}
	
	public void showNumbers() {
		for (int i = 0; i < this.judgeNumbers.getNumbers().size(); i++) {
			System.out.println(judgeNumbers.getNumbers().get(i));
		}
	}
	
	public void showResult() {
		System.out.println("스트라이크: " + this.strikeCounts);
		System.out.println("볼: " + this.ballCounts);
	}
}
