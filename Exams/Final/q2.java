package oldFinal;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		double[] numbers = new double[5];
		double mean = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = read.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) {
			mean = mean + numbers[i];
		}
		mean = mean / numbers.length;
		
		System.out.println(numbers[2]-mean);
	}

}
