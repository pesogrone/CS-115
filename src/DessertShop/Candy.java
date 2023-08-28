/*
 * Program: Lab3a - Dessert Shop, Part 1—Class Structure
 * Names: Porter Sykes & Mijhail Britos
 * Date: 09/27/2022
 * Instructor: Brother Light
 * Description: Dessert Shop superclass and subclass
 */
package DessertShop;

public class Candy extends DessertItem implements SameItem<Candy> {
	// attributes

	private double candyWeight;
	private double pricePerPound;

	// Constructors
	public Candy() {
		super();
		candyWeight = 0;
		pricePerPound = 0;
		packaging = "";
	}

	public Candy(String n, double can, double ppp) {
		super(n);
		candyWeight = can;
		pricePerPound = ppp;
		packaging = "Bag";
		
	}

	// Method
	public double getCandyWeight() {
		return candyWeight;
	}

	public void setCandyWeight(double can) {
		candyWeight = can;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setPricePerPound(double ppp) {
		pricePerPound = ppp;
	}

	public double calculateCost() {

		return (candyWeight * pricePerPound);
	}public String toString() {
		String line1 = String.format("%n%s (%s)", getName(), packaging);
		String line2_1 = String.format("%8.2f lbs. @ $%.2f/lb.:", getCandyWeight(), getPricePerPound());
		String line2_2 = String.format("$%.2f", calculateCost());
		String line2_3 = String.format("[Tax: $%.2f]", calculateTax());
		String outputVar = String.format("%s%n%-53s%s%17s%n", line1, line2_1, line2_2, line2_3);
		return outputVar;
	}
	public boolean isSameAs(Candy other) {
		if (this.getName().equals(other.getName()) && this.getPricePerPound() == other.getPricePerPound()) {
			return true;
		}else {
			return false;
		}//end of if statement
		
	}//end of methods
}
