import java.util.*;
//above imports array use as well as scanner

public class ShoppingCart {

	//private fields
	private String customerName;
	private String currentDate;
	
	private ArrayList <ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

	
	//public member methods
	public ShoppingCart() {
		this.customerName = "none";
		this.currentDate = "January 1, 2016";
	}
	
	public ShoppingCart(String name, String date) {
		this.currentDate = date;
		this.customerName = name;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public String getDate() {
		return currentDate;
	}
	
	//add item
	public void addItem(ItemToPurchase item){
		cartItems.add(item);
	}
	
	//remove item
	public void removeItem(String name) {
		boolean found = false;
	
		for (ItemToPurchase item: cartItems) {
			if (item.getName().equalsIgnoreCase(name)) {
				cartItems.remove(item);
				found = true;
				break;
			}
		}
	
		if (!found) {
			System.out.println("Item not found in cart. Nothing removed.");
		
		}
}
	

	 public void modifyItem(ItemToPurchase itemToPurchase){

	       int val = 0;

	       for(int i = 0; i < cartItems.size(); ++i){

	           if(cartItems.get(i).getName().equals(itemToPurchase.getName())){
	               cartItems.get(i).setQuantity(itemToPurchase.getQuantity());
	               ++val;
	           }

	       }
	       if(val == 0){
	           System.out.println("Item not found in cart. Nothing modified.");
	       }
	 }

	//get items in cart
	public int getNumItemsInCart() {
		int a = 0;
		for (ItemToPurchase item: cartItems) {
			a = a + item.getQuantity();
		}
		return a;
		
	}
	
	//get cost of cart
	public int getCostOfCart() {
		int b = 0;
		for (ItemToPurchase item: cartItems) {
			b = b + (item.getPrice() * item.getQuantity());
			
		}
		return b;
	}
	
	public void printTotal() {
	     
	      int totalCost = 0;
	     
	      System.out.println(customerName + "'s Shopping Cart - " + currentDate);
	      System.out.println("Number of Items: " + getNumItemsInCart());            
	      System.out.println("");
	     
	      if (cartItems.size() > 0) {                                                                                                     //your arraylist here
	         for (int i = 0; i < cartItems.size(); ++i) {
	            cartItems.get(i).printItemCost();
	         }
	      }
	      else {
	         System.out.println("SHOPPING CART IS EMPTY");
	      }
	     
	      totalCost = getCostOfCart();
	      System.out.println("");
	      System.out.println("Total: $" + totalCost);
	   }
	
	
	
	public void printDescriptions() {
		
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);

	    System.out.println("");

	    System.out.println("Item Descriptions"); 
	    

		 if (cartItems.size() > 0) { 
			    for (int i = 0; i < cartItems.size(); ++i) {
			        cartItems.get(i).printItemDescription();
			    }

	   }
	    else {
	    	System.out.println("SHOPPING CART IS EMPTY");
	    }
	}
	
}

/*
Eric Knapp
Programming Assignment 4
Online Shopping Cart (Part 2)
March 2, 2021 
*/
	
	
		


