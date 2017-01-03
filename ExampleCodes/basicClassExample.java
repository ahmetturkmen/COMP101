import java.util.Scanner;

class point3D {
	double xCoordinate;
	double yCoordinate;
	double zCoordinate;

}

class point2D { // example of the slide Week 9

	double xCoordinate;
	double yCoordinate;

	public point2D(double X, double Y) {
		xCoordinate = X;
		yCoordinate = Y;

	}
}

class line2D {

	public point2D p1;
	private point2D p2;

	public double calculateLength() {
	

	double result; 

	result= Math.sqrt(Math.pow((p2.xCoordinate-p1.xCoordinate),2)+Math.pow((p2.yCoordinate-p1.yCoordinate),2);
	
	public static int calculator = 0; 
	return result;
	
	
}
}

public class basicClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		point2D p1 = new point2D(5.6, 9.3);
		point2D l1 = new point2D(6.78,3.21);

		/*
		 * p1.xCoordinate = 5.6; p1.yCoordinate = 9.3; p2.xCoordinate = 6.78;
		 * p2.yCoordinate = 3.21;
		 */

		l1.p1 = p1;
		Scanner read = new Scanner(System.in);
		double A = l1.calculateLength();
		p1.xCoordinate = read.nextDouble();

	}

}
