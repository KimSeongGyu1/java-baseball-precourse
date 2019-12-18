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
	
	public GameNumbers getNumbers() {
		return this.userNumbers;
	}
}
