package ahmet_comp101;

import java.util.Scanner;

public class LAB3Q3 {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		int n; 
		n=input.nextInt();
		int numberOfStars;
		numberOfStars =2*n-1;
		int space;
		space=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=space; j++){
				System.out.printf(" ");
			}
			for (int k=1; k<=numberOfStars; k++){
				System.out.printf("*");
			}
			System.out.println("");
			numberOfStars-=2;
			space++;
		}
		
		space =n-1;
		
		for(int i=1; i<=n+1; i++){
			for(int j=1; j<=space+1; j++){
				System.out.printf(" ");
			}
			for (int k=1; k<=numberOfStars; k++){
				System.out.printf("*");
			}
			System.out.println("");
			numberOfStars+=2;
			space--;
			
		}
	
	}
	
}
