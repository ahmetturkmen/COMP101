import java.util.Scanner;

public class e2DArray {

	public static int[][] matrixSummation(int[][] mA, int[][] mB){
		
		int[][] sM = new int[2][4];
		
		for (int i=0; i<2; i++){
			for (int j=0; j<4; j++){
				sM[i][j] = mA[i][j] + mB[i][j];
			}
		}
		return sM;
		
	}
	
	public static int[][] matrixTranspose(int[][] m){
		
		int[][] T = new int[4][2];
		

		for (int i=0; i<2; i++){
			for (int j=0; j<4; j++){
				T[j][i] = m[i][j];
			}
		}
		
		return T;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrixA   = new int[2][4];
		int[][] matrixB   = new int[2][4];
		int[][] sumMatrix = new int[2][4];
		int[][] matrixT   = new int[4][2];
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<2; i++){
			for (int j=0; j<4; j++){
				matrixA[i][j] = input.nextInt();
			}
		}
		
		for (int i=0; i<2; i++){
			for (int j=0; j<4; j++){
				matrixB[i][j] = input.nextInt();
			}
		}
		
		sumMatrix = matrixSummation(matrixA, matrixB);
		matrixT = matrixTranspose(matrixA);
		
	}

}
