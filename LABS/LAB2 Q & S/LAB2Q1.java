package ahmet_comp101;

import java.util.Scanner;

public class LAB6Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int h, m, s;
		s = input.nextInt();

		h = s / 3600;
		s = s - (3600 * h);
		m = s / 60;
		s = s - (60 * m);

		if (h < 10) {
			System.out.printf("0%d:", h);
		} else {
			System.out.printf("%d:", h);
		}
		if (m < 10) {
			System.out.printf("0%d:", m);
		} else {
			System.out.printf("%d:", m);
		}
		if (s < 10) {
			System.out.printf("0%d", s);
		} else {
			System.out.printf("%d", s);
		}

	}

}
