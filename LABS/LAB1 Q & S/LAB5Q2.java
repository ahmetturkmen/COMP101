package ahmet_comp101;

import java.util.Scanner;

public class LAB5Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		char letter;
		System.out.printf("Write down the letter\n");
		
		letter = input.next().charAt(0);
		
		int index =(int)letter -64;
		System.out.printf("%d\n",index);
		
			
 }
}