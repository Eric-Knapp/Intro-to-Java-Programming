import java.util.Scanner;
public class ProgrammingAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);

		// declaring 4 integers
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		int d = scnr.nextInt();
		
		// type conversion from integers to double
		double e = a;
		double f = b;
		double g = c;
		double h = d;
		
		// output integer product and average
		System.out.print(a * b * c * d + " ");
		System.out.println((a + b + c + d) / 4);
		
		// output double product and average 
		System.out.printf("%.3f ", e * f * g * h);
		System.out.printf("%.3f\n", (e + f + g + h) / (4));
		
		

			
// Eric Knapp
// Programming Assignment 1		
// February 6 2021		
		
	}

}
