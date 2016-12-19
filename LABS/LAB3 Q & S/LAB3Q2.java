import java.util.Scanner;

// 02.05.2016
public class LAB3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit = 0;
		int realNumber = 0, sum = 0;
		Scanner read = new Scanner(System.in);
		realNumber = read.nextInt();

		while (realNumber != 0) {
			digit = realNumber % 10;
			sum = (int) (sum + Math.pow(2, digit));
			realNumber = (realNumber - digit) / 10;

		}
		System.out.printf(" %d ", sum);

	}

}
