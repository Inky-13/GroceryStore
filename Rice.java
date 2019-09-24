
public class Rice extends Item{
	
	private int riceCentPricePerPound;
	private double riceWeightPound;
	
	/**
	 * Null constructor for Rice class
	 */
	Rice(){
		super("undefined");
		this.riceCentPricePerPound = 0;
	}
	
	/**
	 * Initializes Rice data
	 */   
	Rice(String riceName, double riceWeight, int riceCentPrice) {
		super(riceName);
		this.riceWeightPound = riceWeight;
		this.riceCentPricePerPound = riceCentPrice;
		
	}
	
	/**
	 * Setters and Getters for Rice data
	 */
	int getRiceCentPricePerPound() { //Gets price per pounds in cents.
		return riceCentPricePerPound;
	}
	
	void setRiceCentPricePerPound(int riceCentPricePerPound) { //Sets price per pound in cents.
		this.riceCentPricePerPound = riceCentPricePerPound;
	}
	
	double getRiceWeightPound() { //Gets weight of the rice in pounds.
		return riceWeightPound;
	}
	
	void setRiceWeightPound(double riceWeightPound) { //Sets weight of the rice in pounds.
		this.riceWeightPound = riceWeightPound;
	}
	
	/**
	 * Methods for Rice data
	 */
	public int getCost() { //This method overrides the getCost() method from the item class to return the total total cost of the rice. 
		return (this.riceCentPricePerPound) * ((int)(this.riceWeightPound));

	}
	
	public String getName() { //This method overrides the getName() method from the item class to return the formatted name with details of the rice.
		return this.riceWeightPound + " lbs. @ " + this.riceCentPricePerPound + "/lb.\n"
				+ this.name;
	}
}

	