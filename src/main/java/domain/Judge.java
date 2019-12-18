package domain;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Judge {
	private static final int NUM_OF_NUMBERS = 3;
	private static final int NUM_RANGE = 9;
	private static final int MIN_NUM = 1;
	
	private static Random RANDOM = new Random();
	private GameNumbers judgeNumbers;
	
	public Judge() {
		this.judgeNumbers = createRandNumbers();
	}
	
	private GameNumbers createRandNumbers() {
		List<Integer> randNums = new ArrayList<Integer>();
		int count = 0;
		while(count < NUM_OF_NUMBERS) {
			addIfUnique(randNums, RANDOM.nextInt(NUM_RANGE) + MIN_NUM);
			count++;
		}
		return new GameNumbers(randNums);
	}
	
	private void addIfUnique(List<Integer> numbers, int input) {
		if (!numbers.contains(input)) {
			numbers.add(input);
		}
	}
	
	public void showNumbers() {
		for (int i = 0; i < this.judgeNumbers.getNumbers().size(); i++) {
			System.out.println(judgeNumbers.getNumbers().get(i));
		}
	}
}
