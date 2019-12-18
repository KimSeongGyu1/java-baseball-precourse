package application;

import inputview.InputView;

public class YesNoFromInt {
	private static final int NUM_FOR_TRUE = 1;
	private static final int NUM_FOR_FALSE = 2;
	
	boolean yesNo;
	
	public YesNoFromInt() {
		yesNo = true;
	}
	
	public boolean isTrue() {
		return this.yesNo;
	}
	
	public void askMoreGame() {
		try {
			int input = InputView.enterMoreGame();
			checkValidInt(input);
			this.yesNo = convertIntToBool(input);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			askMoreGame();
		}
	}
	
	private void checkValidInt(int input) {
		if (input != NUM_FOR_TRUE && input != NUM_FOR_FALSE) {
			throw new IllegalArgumentException("1 또는 2만 입력해주세요");
		}
	}
	
	private boolean convertIntToBool(int input) {
		if (input == NUM_FOR_TRUE) {
			return true;
		}
		return false;
	}
}
