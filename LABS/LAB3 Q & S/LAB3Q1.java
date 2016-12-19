import java.util.Scanner;

public class LAB3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 0;
		Scanner read = new Scanner(System.in);
		N = read.nextInt();

		for (int i = 2; i < N; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}

			}
			if (sum == i) {
				System.out.printf(" %d ", i);
			}

		}
	}
}
