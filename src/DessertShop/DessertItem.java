/*
 * Program: Lab6b - 
 * Names: Porter Sykes & Mijhail Britos
 * Date: 10/25/2022
 * Instructor: Brother Light
 * Description: Comparable method
 */
package DessertShop;

public abstract class DessertItem implements Packaging, Comparable<DessertItem> {
	// Attribute
	private String name;
	private double taxPercent = 7.25;
	public String packaging = "";

	// Constructor
	public DessertItem() {
		name = "";
	}

	public DessertItem(String n) {
		name = n;
	}// end of constructor

	// Method
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(double tp) {
		taxPercent = tp;
	}

	public abstract double calculateCost();

	public double calculateTax() {
		return calculateCost() * (taxPercent / 100);
	}// method to retrieve packaging

	public String getPackaging() {
		return packaging;
	}// end of getPackaging

	public void setPackaging(String p) {
		packaging = p;
	}// end of setpackaging

  public int compareTo(DessertItem other) {
	return Double.compare(this.calculateCost(), other.calculateCost());
		
	
}}
