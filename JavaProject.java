/**
 * Created by ahmetturkmen on 08/01/2017
 */


import java.util.Arrays;
import java.util.Scanner;

public class AhmetTurkmen_javaProject {
	private static int ROWS = 20;
	private static int COLOUMNS = 5;
	private static String[][] dbTable = new String[ROWS][COLOUMNS];

	public static void main(String[] args) {

		String[] coloumns = { "A-E", "F-J", "K-O", "P-T", "U-Z" };
		Scanner sc = new Scanner(System.in);
		String enteredData = sc.next();

		prepareTable();
		
		// dbTable.length provides row numbers of the array

		while (!enteredData.equals("END")) {                

			if (!checkForExistence(enteredData, dbTable)) {                  // Checking the data for existence in dbTable
				int columnNumber = getColoumnNumber(enteredData);
				for (int rowCount = 0; rowCount < dbTable.length; rowCount++) {
					if (dbTable[rowCount][columnNumber].isEmpty()) {
						dbTable[rowCount][columnNumber] = enteredData;
						break;
					}

				}

			}
			enteredData = sc.next();

		}
		for (int col = 0; col < COLOUMNS; col++) {   
			System.out.print(coloumns[col] + " : ");
			for (int row = 0; row < dbTable.length; row++) {
				if (!dbTable[row][col].equals(""))
					System.out.print(dbTable[row][col] + " ");
			}
			System.out.printf("\n");
		}
	}

	private static boolean checkForExistence(String theAbbrevation, String[][] db) {

		int columnNo = getColoumnNumber(theAbbrevation);
		int k = 0;
		while (k < ROWS) {
			if (db[k][columnNo].equals(theAbbrevation))
				return true;
			k++;
		}
		return false;

	}

	
	// get Method created for getting column in different states
	private static int getColoumnNumber(String givenAbbreviation) {

		char initialLetter = givenAbbreviation.charAt(0); // defines the initial
		int indexOfLetter = (int) initialLetter - 64;
		int columnNumber = 0; // default value which points colounm 0 "A-E"
		if (indexOfLetter > 0 && indexOfLetter <= 5) {
			columnNumber = 0;
		} else if (indexOfLetter > 5 && indexOfLetter <= 10) {
			columnNumber = 1;
		} else if (indexOfLetter > 10 && indexOfLetter <= 15) {
			columnNumber = 2;
		} else if (indexOfLetter > 15 && indexOfLetter <= 20) {
			columnNumber = 3;
		} else if (indexOfLetter > 20 && indexOfLetter <= 26) {
			columnNumber = 4;
		}
		return columnNumber;

	} 

	public static void prepareTable(){
		for (String[] row : dbTable) { // fill the table with empty otherwise,
						// NullPointerException error occurs
			Arrays.fill(row, "");

}

	}
}
