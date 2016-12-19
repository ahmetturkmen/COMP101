import java.util.Scanner;

public class LAB5Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double V, R1, R2, R3, i1, i2, i3;
		Scanner read = new Scanner(System.in);
		System.out.println("Write down voltage ");
		V = read.nextDouble();
		System.out.println("Write down resistance1");
		R1 = read.nextDouble();
		System.out.println("Write down resistance2");
		R2 = read.nextDouble();
		System.out.println("Write down resistance3");
		R3 = read.nextDouble();
		i1 = V / R1;
		i2 = V / R2;
		i3 = V / R3;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

	}

}
