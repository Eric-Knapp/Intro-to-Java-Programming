import java.util.*;

public class ShoppingCartManager {
	
	public static char printMenu(ShoppingCart thisCart, Scanner scnr) {
		char menuChoice =' ';
		String prodName;
		String prodDescription;
		int prodPrice = 0;
		int prodQuantity = 0;

		//menu and options
		
		
	    System.out.println("MENU");
	    System.out.println("a - Add item to cart");
	    System.out.println("d - Remove item from cart");
	    System.out.println("c - Change item quantity");
	    System.out.println("i - Output items' descriptions");
	    System.out.println("o - Output shopping cart");
	    System.out.println("q - Quit"); 
	    System.out.println("");
		
	    
	    
	    while (menuChoice != 'a' && menuChoice != 'd' && menuChoice != 'c' && menuChoice != 'i' && menuChoice != 'o' && menuChoice != 'q'){
	        
	        System.out.println("Choose an option:");
	        menuChoice = scnr.next().charAt(0);
	    }  
	    
	    //add items to cart
	    
	    switch (menuChoice) {
	    case 'a':
	    	scnr.nextLine();
	        System.out.println("ADD ITEM TO CART");
	        System.out.println("Enter the item name:");
	        prodName = scnr.nextLine();

	        System.out.println("Enter the item description:");
	        prodDescription = scnr.nextLine();

	        System.out.println("Enter the item price:");
	        prodPrice = scnr.nextInt();

	        System.out.println("Enter the item quantity:");
	        prodQuantity = scnr.nextInt();

	        ItemToPurchase newItem = new ItemToPurchase(prodName, prodDescription, prodPrice, prodQuantity);
	        thisCart.addItem(newItem);
	        
	        menuChoice = ' ';
	        System.out.println("");
	        break;
	    
	        
	    //remove items from cart
	     case'd':
	        scnr.nextLine();
	        System.out.println("REMOVE ITEM FROM CART");
	        System.out.println("Enter name of item to remove:");
	        prodName = scnr.nextLine();
	        thisCart.removeItem(prodName);
	        menuChoice = ' ';
	        System.out.println("");
	        break;
	        
	        
	    //change item quantity
	     case 'c':
	    	scnr.nextLine();

	        System.out.println("CHANGE ITEM QUANTITY");
	        System.out.println("Enter the item name:");
	        prodName = scnr.nextLine();
	        System.out.println("Enter the new quantity:");
	        prodQuantity = scnr.nextInt();
	        ItemToPurchase modd = new ItemToPurchase();
	        modd.setName(prodName);
	        modd.setQuantity(prodQuantity);
	        thisCart.modifyItem(modd);
	        
	        menuChoice = ' ';
	        System.out.println("");
	        break;
	    
	    //output item descriptions
	     case 'i':
	    	System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
	    	thisCart.printDescriptions();

	    	menuChoice = ' ';
	    	System.out.println("");
	    	break;
	    
	    //output shopping cart list
	     case 'o':
	    	System.out.println("OUTPUT SHOPPING CART");
	    	thisCart.printTotal();
	    	
	    	menuChoice = ' ';
	    	System.out.println("");
	    	break;
	    	}
	    
	    
	    return menuChoice;
	    
	    }
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String custName;
		String tDate;
		char choice = ' ';
		

		System.out.println("Enter Customer's Name:");
		custName = scnr.nextLine();
		
		System.out.println("Enter Today's Date:");
		tDate = scnr.nextLine();

	    	System.out.println("\nCustomer Name: " + custName); 
	    	System.out.println("Today's Date: " + tDate);
	    	System.out.println();
		
		ShoppingCart thisCart = new ShoppingCart(custName, tDate);
		
	while(choice != 'q') {
			choice = printMenu(thisCart, scnr); 
		} 
		return;
	}


}

/*
Eric Knapp
Programming Assignment 4
Online Shopping Cart (Part 2)
March 2, 2021 
*/
