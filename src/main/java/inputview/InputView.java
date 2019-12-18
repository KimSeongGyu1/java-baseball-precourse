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
			System.out.println(e.getMessage());
			return enterUserNumbers();
		}
	}
}
