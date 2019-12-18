package domain;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import outputview.OutputView;

public class Judge {
	private static final int NUM_OF_NUMBERS = 3;
	private static final int NUM_RANGE = 9;
	private static final int MIN_NUM = 1;
	private static final int FINISHING_COUNTS = 3;
	
	private static Random RANDOM = new Random();
	private GameNumbers judgeNumbers;
	
	public Judge() {}
	
	public void createRandNumbers() {
		List<Integer> randNums = new ArrayList<Integer>();
		while(randNums.size() < NUM_OF_NUMBERS) {
			addIfUnique(randNums, RANDOM.nextInt(NUM_RANGE) + MIN_NUM);
		}
		this.judgeNumbers = new GameNumbers(randNums);
	}

	private void addIfUnique(List<Integer> numbers, int input) {
		if (!numbers.contains(input)) {
			numbers.add(input);
		}
	}
	
	public boolean checkFinished(GameNumbers userNumbers) {
		int strikeCounts = this.judgeNumbers.getExactMatchingCounts(userNumbers);
		int ballCounts = this.judgeNumbers.getOverlappingCounts(userNumbers) - strikeCounts;
		OutputView.showResult(strikeCounts, ballCounts);
		
		if (strikeCounts == FINISHING_COUNTS) {
			return true;
		}
		return false;
	}
}
