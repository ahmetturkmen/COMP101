import java.util.Scanner;

public class LAB4Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char ch;
		ch = sc.next().charAt(0);

		while (ch != '!') {
			if (isLower(ch)) {
				System.out.printf("%c", toUpper(ch));
			}
			if (isUpper(ch)) {
				System.out.printf("%c", toLower(ch));
			}
			if (ch == ' ') {
				System.out.printf(" ");
			}

			if (isDigit(ch)) {
				printDigit(ch);
			}
			ch = sc.next().charAt(0);
		}
	}

	public static char toUpper(char ch) {

		char input = Character.toUpperCase(ch);
		return input;

	}

	public static char toLower(char ch) {
		char input = Character.toLowerCase(ch);
		return input;
	}

	public static boolean isUpper(char ch) {

		boolean input = Character.isUpperCase(ch);
		if (input == true) {
			return true;
		} else
			return false;

	}

	public static boolean isLower(char ch) {

		boolean input = Character.isLowerCase(ch);

		if (input == true) {

			return true;
		} else
			return false;
	}

	public static boolean isDigit(char ch) {

		boolean input = Character.isDigit(ch);
		if (input == true) {
			return true;
		} else
			return false;
	}

	public static void printDigit(char ch) {
		String input = null;
		if (isDigit(ch) == true) {
			if (ch == '0') {
				input = "zero";
			} else if (ch == '1') {
				input = "one";
			} else if (ch == '2') {
				input = "two";
			} else if (ch == '3') {
				input = "three";
			} else if (ch == '4') {
				input = "four";
			} else if (ch == '5') {
				input = "five";
			} else if (ch == '6') {
				input = "six";
			} else if (ch == '7') {
				input = "seven";
			} else if (ch == '8') {
				input = "eight";
			} else if (ch == '9') {
				input = "nine";
			}

			System.out.printf("%s", input);
		}
	}

}
