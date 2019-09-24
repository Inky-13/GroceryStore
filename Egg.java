
public class Egg extends Item{
	
	private int eggCentPricePerDozen;
	private int eggNumber;
	
	/**
	 * Null constructor for Egg class
	 */
	Egg() {
		super("undefined");
		this.setEggCentPricePerDozen(0);
		this.setEggNumber(0);
	}
	
	/**
	 * Initializes Egg data
	 */ 
	Egg(String eggName, int eggNumber, int eggCentPricePerDozen) {
		super(eggName);
		this.setEggNumber(eggNumber);
		this.setEggCentPricePerDozen(eggCentPricePerDozen);
	}
	
	/**
	 * Setters and Getters for Egg data
	 */
	int getEggCentPricePerDozen() { //Gets the price per 12 eggs in cents.
		return eggCentPricePerDozen;
	}

	void setEggCentPricePerDozen(int eggCentPricePerDozen) { //Sets the price per 12 eggs in cents.
		this.eggCentPricePerDozen = eggCentPricePerDozen;
	}

	int getEggNumber() { //Gets the number of eggs.
		return eggNumber;
	}

	void setEggNumber(int eggNumber) { //Sets the number of eggs.
		this.eggNumber = eggNumber;
	}
	
	/**
	 * Methods for Egg data
	 */
	public int getCost() { //This method overrides the getCost() method from the item class to return the total total cost of the eggs.
		return (int)((eggCentPricePerDozen/12) * (eggNumber));
	}
	
	public String getName() { //This method overrides the getName() method from the item class to return the formatted name with details of the eggs.
		return this.eggNumber + " @ " + this.eggCentPricePerDozen + "/dz.\n"
				+ this.name;
	}
		
}
