import java.util.Scanner;

public class ProgrammingAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);	
				
		int A = scnr.nextInt();
			
		if (A < 11 || A > 100) {
			System.out.println("Input must be 11-100");
		}
		else{
			while(A >= 11 && A <= 100) {
			System.out.print(A + " ");
			if (A % 11 == 0) {	
				break;
				}
				--A;
				}
			System.out.println();
			}
		
	}
}

/*
Eric Knapp
Programming Assignment 3
Purpose of Program: Countdown until matching digits
Feb 23 2021
*/

