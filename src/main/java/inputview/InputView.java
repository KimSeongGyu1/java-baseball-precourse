package inputview;

import java.util.Scanner;

public class InputView {
	static Scanner SCANNER = new Scanner(System.in);
	
	public static int[] enterUserNumbers() {
		try {
			return InputParser.parseStringToIntArr(SCANNER.nextLine());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return enterUserNumbers();
		}
	}
}
