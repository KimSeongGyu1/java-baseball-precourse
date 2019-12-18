package application;

import domain.User;
import outputview.OutputView;
import domain.Judge;

public class BaseballGame {	
	public void play() {
		User user = new User();
		YesNoFromInt isStartingGame = new YesNoFromInt();	// true로 초기화 됨
		
		while (isStartingGame.isTrue()) {
			Judge judge = new Judge();			// 생성시 마다 랜덤 숫자 생성
			playOneSet(user, judge);
			isStartingGame.askMoreGame();
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
