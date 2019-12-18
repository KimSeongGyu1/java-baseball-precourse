package application;

import domain.User;
import domain.Judge;

public class BaseballGame {
	public void play() {
		User user = new User();
		Judge judge = new Judge();
		
		while(!judge.isGameFinished()) {
			user.enterInput();
			judge.checkResult(user.getNumbers());
			judge.showResult();
		}
	}
}
