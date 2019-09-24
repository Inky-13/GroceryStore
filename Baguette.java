
public class Baguette extends Item{
	
	protected int baguetteCentPrice;
	
	/**
	 * Null constructor for Baguette class
	 */
	Baguette() {
		super("undefined");
		this.baguetteCentPrice = 0;
	}
	
	/**
	 * Initializes Baguette data
	 */
	Baguette(String baguetteName, int baguetteCentPrice) {
		super(baguetteName);
		this.baguetteCentPrice = baguetteCentPrice;
	}
	
	/**
	 * Setters and Getters for Rice data
	 */
	int getBaguetteCentPrice() { //Gets the price of one baguette in cents.
		return baguetteCentPrice;
	}
	
	void setBaguetteCentPrice(int baguetteCentPrice) { //Sets the price of one baguette in cents.
		this.baguetteCentPrice = baguetteCentPrice;
	}
	
	/**
	 * Methods for Baguette data
	 */
	public int getCost() { //This method overrides the getCost() method from the item class to return the total total cost of the baguettes.
		return this.baguetteCentPrice;
	}
	
	public String getName() { //This method overrides the getName() method from the item class to return the formatted name with details of the eggs.
		return this.name;
	}
}
