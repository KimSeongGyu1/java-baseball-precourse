package application;

import domain.User;
import outputview.OutputView;
import domain.Judge;

public class BaseballGame {	
	public void play() {
		User user = new User();
		Judge judge = new Judge();
		YesNoFromInt isGameStart = new YesNoFromInt();	// true로 초기화 됨

		while (isGameStart.isTrue()) {
			judge.createRandNumbers();
			playOneSet(user, judge);
			isGameStart.askMoreGame();
		}
	}
	
	public void playOneSet(User user, Judge judge) {
		boolean isFinished = false;
		while (!isFinished) {
			user.enterInput();
			isFinished = judge.checkFinished(user.getNumbers());
		}
		OutputView.showFinish();
	}
}
