package outputview;

public class OutputView {
	private static final int ZERO = 0;
	
	public static void showResult(int strikeCounts, int ballCounts) {
		StringBuilder message = new StringBuilder();
		if (strikeCounts > ZERO) {
			message.append(strikeCounts + "스트라이크 ");
		}
		if (ballCounts > ZERO) {
			message.append(ballCounts + "볼");
		}
		if (strikeCounts == ZERO && ballCounts == ZERO) {
			message.append("낫싱");
		}
		System.out.println(message);
	}
	
	public static void showFinish() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
	}
}
