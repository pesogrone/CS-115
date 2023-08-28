/*
 * Program: Lab3a - Dessert Shop, Part 1—Class Structure
 * Names: Porter Sykes & Mijhail Britos
 * Date: 09/27/2022
 * Instructor: Brother Light
 * Description: Dessert Shop superclass and subclass
 */
package DessertShop;

public class IceCream extends DessertItem {

	// Attributes
	private int scoopCount;
	private double pricePerScoop;

	// Constructors
	public IceCream() {
		super();
		scoopCount = 0;
		pricePerScoop = 0;
		packaging = "";
	}

	public IceCream(String n, int sc, double pps) {
		super(n);
		scoopCount = sc;
		pricePerScoop = pps;
		packaging = "Bowl";
	}// end of Constructors

	// Methods
	public int getScoopCount() {
		return scoopCount;
	}

	public void setScoopCount(int sc) {
		scoopCount = sc;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setPricePerScoop(double pps) {
		pricePerScoop = pps;
	}
	public double calculateCost() {
	return (scoopCount * pricePerScoop);
	}public String toString() {
		String line1 = String.format("%n%s IceCream (%s)", getName(),packaging);
		String line2_1 = String.format("%5d lbs. @ $%.2f/scoop:", getScoopCount(), getPricePerScoop());
		String line2_2 = String.format("$%.2f", calculateCost());
		String line2_3 = String.format("[Tax: $%.2f]", calculateTax());
		String outputVar = String.format("%s%n%-53s%s%17s%n", line1, line2_1, line2_2, line2_3);
		return outputVar;
	}// end of methods
}
