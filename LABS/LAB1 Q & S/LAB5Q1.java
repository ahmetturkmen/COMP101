import java.util.Scanner;

public class LAB5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		double a,b,area;
		

		System.out.println("Write length 1 ");
		a = read.nextDouble();
		System.out.println("Write length 2 ");
		b= read.nextDouble();
		area=a*b;
		System.out.println("The area of rectangle is "+area);
		area = a*b*Math.PI;
		System.out.println("The area of the ellipse is "+area);
		
		

	}

}
