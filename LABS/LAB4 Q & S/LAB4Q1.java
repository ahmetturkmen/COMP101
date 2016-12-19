import java.util.Scanner;

public class LAB4Q1 {

	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
	
		int n =read.nextInt();
	
		System.out.println(fibonacci(n));
		
		
	}

}
