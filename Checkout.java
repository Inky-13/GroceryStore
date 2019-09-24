
import java.util.ArrayList;

public class Checkout {
	
	ArrayList<Item> itemList = new ArrayList<>();
	int numberOfItems;
	
	/**
	 * Null constructor for Checkout class
	 */
	Checkout(){
		
	}
	
	/**
	 * Methods for Checkout data
	 */
	void enterItem(Item item) { //This methods adds a given item into the list of items and adds one to the item counter.
		this.itemList.add(item);
		this.numberOfItems++;
	}
	
	int numberOfItems() { //This method gets the number of items.
		return this.numberOfItems;
	}
	
	int totalCost() { //This method calculates the total cost of the items that belong to the item list.
		Item item;
		int itemCost;
		int totalCost = 0;
		for(int i = 0; i < this.itemList.size(); i++) {
			 item = itemList.get(i);
			 itemCost = item.getCost();
			 totalCost += itemCost;
		}
		return totalCost;
	}
	
	int totalTax() { //This method calculates the total tax of all the items in the item list using the TAX_RATE constant of the GroceryStore class.
		return (int)(totalCost() * (GroceryStore.TAX_RATE/100));
	}
	
	void clear() { //This method clears the list of items and sets the number of items to zero.
		this.itemList.clear();
		this.numberOfItems = 0;
	}
	
	
	public String toString() { //This method overrides the toString method of the Object class to return a formatted receipt when printing the checkout class. 
		String itemName;
		String itemCost;
		String output = "";
		
		for(int i = 0; i < this.itemList.size(); i++) {
			 itemName = this.itemList.get(i).getName();
			 itemCost = GroceryStore.cents2dollarsAndCents(this.itemList.get(i).getCost());
			 
			 output += itemName + "                  " + itemCost + "\n";
			 
		}
		
		
		return ("        " + GroceryStore.STORE_NAME + "\n")+ ("           " + "-------------------- \n") + output + "\nTax " + GroceryStore.cents2dollarsAndCents(totalTax()) + "\n"
				+ "Total Cost " + GroceryStore.cents2dollarsAndCents(totalCost());
		
	}
	
}
