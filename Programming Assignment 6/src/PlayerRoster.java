import java.util.*;

public class PlayerRoster {


	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int [] jerseyNum = new int [5];
		int [] playerRating = new int [5];
		char menuOp = 'c';
		
		
		// user enters jersey # and player rating
		for (int i = 0; i < jerseyNum.length; ++i) {
			
			System.out.println("Enter player "  + (i + 1) + "'s jersey number:");
			jerseyNum[i] = scan.nextInt();
			
			System.out.println("Enter player " + (i + 1) + "'s rating:");
			playerRating[i] = scan.nextInt();
			
			System.out.println();
		}
		printRoster(jerseyNum, playerRating);
	
		
		while (menuOp != 'q') {
			menu();
			System.out.println("Choose an option:");
			menuOp = scan.next().charAt(0);
		
		
		switch(menuOp) {
		
		case 'q':
			break;
			// update player rating
		case 'u':
			if (menuOp == 'u') {
				System.out.println("Enter a jersey number: ");
				int jersey = scan.nextInt();
				System.out.println("Enter a new rating for player: ");
				int playerRate = scan.nextInt();
				
				for (int i = 0; i < jerseyNum.length; ++i) {
					if (jersey == jerseyNum[i]) {
						playerRating[i] = playerRate;
					}
				}	
			}
			
			break;
			// output roster if choice o
		case 'o':
			if (menuOp == 'o') {
				printRoster(jerseyNum,playerRating);
			}
			break;
			
			
		case 'a':
			if(menuOp == 'a') {
				System.out.println("Enter a rating: ");
				int playerRate = scan.nextInt();
				System.out.println(playerRate);
				System.out.println("\nABOVE " + playerRate);
				
				for (int i = 0; i < jerseyNum.length; ++i) {
					if (playerRating[i] > playerRate) {
						System.out.println("Player" + (i+1) + " -- Jersey number: " + jerseyNum[i] + ", Rating: "+ playerRating[i]);
					}
				}
				System.out.println();
			}
			break;
			
		case 'r':
			if(menuOp == 'r') {
				System.out.println("Enter a jersey number: ");
				int jerseyNumba = scan.nextInt();
				
				System.out.println("Enter a new jersey number: ");
				int newJerseyNum = scan.nextInt();
				
				System.out.println("Enter a rating for a new player: ");
				int newRating = scan.nextInt();
				
				for (int i = 0; i < jerseyNum.length; ++i) {
					if (jerseyNumba == jerseyNum[i]) {
						jerseyNum[i] = newJerseyNum;;
						playerRating[i] = newRating;
					}	
				}
				System.out.println(); // just added
			}
			
		default: 
			break;
			
		}
			
	}

		return;
		
}

	
public static void printRoster(int jerseyNum [], int playerRating []) {
	System.out.println("ROSTER");
	for (int i = 0; i < jerseyNum.length; ++i) {
		System.out.println("Player " + (i+1) + " -- Jersey number: " + jerseyNum[i] + ", Rating: "+ playerRating[i]);
	}
	System.out.println();
}

public static void menu() {
	System.out.println("MENU");
	System.out.println("u - Update player rating"); 
	System.out.println("a - Output players above a rating"); 
	System.out.println("r - Replace player");
	System.out.println("o - Output roster"); 
	System.out.println("q - Quit\n");
}
}

// Eric Knapp
// March 17th 2021
// Purpose of program: Programming assignment 6: Soccer team roster
