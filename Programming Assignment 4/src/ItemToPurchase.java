
public class ItemToPurchase {

	//private variables
	private String itemName;
	private String itemDescription;
	private int itemPrice;
	private int itemQuantity;
	
	//constructor
	public ItemToPurchase(){
		itemDescription = "none";
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	public ItemToPurchase(String name, String description, int price, int itemQuantity) {
	    this.itemDescription = description;
	    this.itemName = name;
	    this.itemPrice = price;
	    this.itemQuantity = itemQuantity;
	}

	//setters
	public void setDescription(String itemDescription) {
	   this.itemDescription = itemDescription;
	}
	public void setName(String itemName){
	   this.itemName = itemName;
	}

	public void setPrice(int itemPrice){
	   this.itemPrice = itemPrice;
	}

	public void setQuantity(int itemQuantity){
	   this.itemQuantity = itemQuantity;
	}
 //getters
	public String getName(){
	   return itemName;
	}
	public int getPrice(){
	   return itemPrice;
	}
	public int getQuantity(){
	   return itemQuantity;
	}
	public String getDescription() {
		return itemDescription;
	}
	
	//print methods
	public void printItemCost() {
		System.out.println(itemName+ " "+itemQuantity + " @ $" + itemPrice+ " = $" + (itemQuantity * itemPrice));
	}
	public void printItemDescription() {
		System.out.println(itemName + ": " + itemDescription);
	}
	
}

/*
Eric Knapp
Programming Assignment 4
Online Shopping Cart (Part 2)
March 2, 2021 
*/
