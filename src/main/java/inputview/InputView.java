package inputview;

import java.util.Scanner;
import java.util.List;

public class InputView {
	static Scanner SCANNER = new Scanner(System.in);
	
	public static List<Integer> enterUserNumbers() {
		try {
			System.out.print("숫자를 입력해주세요: ");
			return InputParser.parseStringToIntList(SCANNER.nextLine());
		} catch (IllegalArgumentException e) {
			System.out.println("적절한 숫자만 입력해주세요");
			return enterUserNumbers();
		}
	}
	
	public static int enterMoreGame() {
		try {
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			return Integer.parseInt(SCANNER.nextLine().trim());
		} catch (IllegalArgumentException e) {
			System.out.println("1또는 2만 입력해주세요");
			return enterMoreGame();
		}
	}
}
