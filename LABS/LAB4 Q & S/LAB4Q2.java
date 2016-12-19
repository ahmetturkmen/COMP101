import java.util.Scanner;

public class LAB4Q2 {
	
	

	public static char toUpper(char ch) {

		char input = Character.toUpperCase(ch);
		return input;

	}

	public static char toLower(char ch) {
		char input = Character.toLowerCase(ch);
		return input;
	}

	public static boolean isUpper(char ch) {

		boolean input = Character.isUpperCase(ch);
		if (input == true) {
			return true;
		} else
			return false;

	}

	public static boolean isLower(char ch) {
		boolean input = Character.isLowerCase(ch);

		if (input == true) {

			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);     
	    char ch;
	    ch = sc.next().charAt(0);
	    
	    while(ch!='!'){
	        if(isLower(ch)){
	            System.out.printf("%c",toUpper(ch));
	        }
	        if(isUpper(ch)){
	            System.out.printf("%c",toLower(ch));
	        }
	       if(ch==' '){
	            System.out.printf(" ");
	        }
	        ch = sc.next().charAt(0);
	    }
	}

	
	


}
