package domain;

import inputview.InputView;

public class User {
	private GameNumbers userNumbers;
	
	public User() {}
	
	public void enterInput() {
		try {
			this.userNumbers = new GameNumbers(InputView.enterUserNumbers());
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			enterInput();
		}
	}
	
	public void showInput() {
		for (int i = 0; i < this.userNumbers.getNumbers().length; i++) {
			System.out.println(userNumbers.getNumbers()[i]);
		}
	}
}
