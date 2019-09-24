
public class FlavoredBaguette extends Baguette{
	
	private String baguetteFlavor;
	private int flavorCentCost;
	
	/**
	 * Null constructor for FlavoredBaguette class
	 */
	FlavoredBaguette() {
		
		super("undefined", 0);
		this.setBaguetteFlavor("undefined");
		this.setFlavorCentCost(0);
	}
	
	/**
	 * Initializes FlavoredBaguette data
	 */
	FlavoredBaguette(String baguetteName, int baguetteCentPrice, String baguetteFlavor, int flavorCentCost) {
		super(baguetteName, baguetteCentPrice);
		this.setBaguetteFlavor(baguetteFlavor);
		this.setFlavorCentCost(flavorCentCost);
	}

	/**
	 * Setters and Getters for FlavoredBaguette data
	 */
	String getBaguetteFlavor() { //Gets the flavor of the baguette.
		return baguetteFlavor;
	}

	void setBaguetteFlavor(String baguetteFlavor) { //Sets the flavor of the baguette.
		this.baguetteFlavor = baguetteFlavor;
	}

	int getFlavorCentCost() { //Gets the cost of the flavor of the baguette in cents.
		return flavorCentCost;
	}

	void setFlavorCentCost(int flavorCentCost) { //Sets the cost of the flavor of the baguette in cents.
		this.flavorCentCost = flavorCentCost;
	}
	
	/**
	 * Methods for FlavoredBaguette data
	 */
	public int getCost() { //This method overrides the getCost() method from the item class to return the total total cost of the flavored baguettes.
		return (int)(super.getCost() + this.flavorCentCost);
	}
	
	public String getName() { //This method overrides the getName() method from the item class to return the formatted name with details of the flavored baguette.
		return this.name + " with" + "\n" + this.baguetteFlavor;
	}
}
