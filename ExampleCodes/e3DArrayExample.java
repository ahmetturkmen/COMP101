import java.util.Scanner;

public class e3DArrayExample {

	public static void readGrades(int[][][] gr){
	
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<gr.length; i++){
			for (int j=0; j<gr[i].length; j++){
				for (int k=0; k<gr[i][j].length; k++){
					gr[i][j][k] = input.nextInt();
				}
			}
		}
	}
	
	public static double[] calculateCourseAverages(int[][][] gr){
		
		int[] cSum = new int[5];
		double[] cAvg = new double[5];
		
		for (int i=0; i<5; i++){
			
			cSum[i] = 0;
			
			for (int j=0; j<3; j++){
				for (int k=0; k<10; k++){
					cSum[i] = cSum[i] + gr[j][k][i];
				}
			}
			
			cAvg[i] = cSum[i]/30.0;
		}
		
		return cAvg;
	}
	
	public static char convertGradeIntoLetter(int grade){
		char letter;
		
		if (grade>=90){
			letter = 'A';
		}
		else if (grade >= 80){
			letter = 'B';
		}
		else if (grade >= 70){
			letter = 'C';
		}
		else if (grade >= 60){
			letter = 'D';
		}
		else{
			letter = 'F';
		}
		
		return letter;
	}
	
	public static char[][][] convertGrades(int[][][] gr){
		
		char[][][] lGr = new char[3][10][5];
		
		for (int i=0; i<3; i++){
			for (int j=0; j<10; j++){
				for (int k=0; k<5; k++){
					lGr[i][j][k] = convertGradeIntoLetter(gr[i][j][k]);
				}
			}
		}
		
		return lGr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] grades = new int[3][10][5];
		char[][][] letterGrades = new char[3][10][5];
		double[] courseAvg = new double[5];
		
		readGrades(grades);
		
		courseAvg    = calculateCourseAverages(grades);
		letterGrades = convertGrades(grades);

	}

}
