package ahmet_comp101;

import java.util.Scanner;

public class LAB6Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, r, h;
		String letter;
		double area;
		final double PI = 3.14;

		
		Scanner input = new Scanner(System.in);

		letter = input.next();

		if (letter.equals("c") || letter.equals("C")) {

			r = input.nextDouble();
			area = r * r * PI;
			System.out.printf("%f\n", area);
		}

		else if (letter.equals("s") || letter.equals("S")) {
			a = input.nextDouble();
			area = a * a;
			System.out.printf("%.2f\n", area);
		}

		else if (letter.equals("r") || letter.equals("R")) {
			a = input.nextDouble();
			h = input.nextDouble();
			area = a * h;
			System.out.printf("%f\n", area);

		}
	}

}
