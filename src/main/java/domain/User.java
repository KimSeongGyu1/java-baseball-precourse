package domain;

import java.util.Scanner;

public class User {
	private String number;
	private static final int LEN_NUMBERS = 3;
	
	public User() {
		number = "";
	}
	
	String getNumber() {
		return number;
	}
	
	void enterNumber() {
		Scanner numScanner = new Scanner(System.in);
		
		do {
			System.out.print("���ڸ� �Է����ּ���: ");
			number = numScanner.nextLine();
			if(!isValidNumber()) {
				System.out.print("�߸��� �Է��Դϴ�. �ٽ� ");
			}
		} while (!isValidNumber());
	}

	boolean isValidNumber() {
		if(number.length() != LEN_NUMBERS) {
			return false;
		} else if (!isAllOneDigitNumber()) {
			return false;
		}
		return true;
	}
	
	boolean isAllOneDigitNumber() {
		for(int i=0;i<number.length();i++) {
			char charAtI = number.charAt(i);
			if((charAtI < '0') || (charAtI > '9')) {
				return false;
			}
		}
		return true;
	}
}
