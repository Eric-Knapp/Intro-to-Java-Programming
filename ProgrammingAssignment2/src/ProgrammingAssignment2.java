import java.util.Scanner;
public class ProgrammingAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		int par = scnr.nextInt();
		if (par != 3 && par != 4 && par != 5) {
			System.out.println("Error");
		}
		else {
		
		int parPerHole = scnr.nextInt();


		if (parPerHole == par) {
			System.out.println("Par");
		}

		else if (parPerHole - 1 == par) {
			System.out.println("Bogey");
		}
		else if (parPerHole + 1 == par) {
			System.out.println("Birdie");
		}
		else if(parPerHole + 2 == par) {
			System.out.println("Eagle");
		}
		}
		
		
	}

}
