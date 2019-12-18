package application;

import domain.User;
import domain.Judge;

public class Main {
	public static void main(String[] args) {
		User me = new User();
		Judge judge = new Judge();
		
		me.enterInput();
		me.showInput();
		System.out.println("-");
		judge.showNumbers();
		judge.checkResult(me.getNumbers());
		judge.showResult();
	}
}
