/*
 * Program: Lab3a - Dessert Shop, Part 1—Class Structure
 * Names: Porter Sykes & Mijhail Britos
 * Date: 09/27/2022
 * Instructor: Brother Light
 * Description: Dessert Shop superclass and subclass
 */
package DessertShop;

public class Cookie extends DessertItem{
	
	//Attributes
	private int cookieQty;
	private double pricePerDozen;
	
	//Constructors
	public Cookie () {
		super ();
		cookieQty = 0;
		pricePerDozen = 0;
		packaging = "";
	}
	
	public Cookie (String n, int cq, double ppd) {
		super (n);
		cookieQty = cq;
		pricePerDozen = ppd;
		packaging = "Box";
	}//end of constructors
	
	//Methods
	
	public int getCookieQty() {
		return cookieQty;
	}
	
	public void setCookieQty(int cq) {
		cookieQty = cq;
	}
	
	public double getPricePerDozen() {
		return pricePerDozen;
	}
	
	public void setPricePerDozen(double ppd) {
		pricePerDozen = ppd;
	}
	

	
	public double calculateCost() {
		
		return (cookieQty * (pricePerDozen/12));
	}
	public String toString() {
		String line1 = String.format("%n%s Cookies (%s)", getName(),packaging);
		String line2_1 = String.format("%5d cookies @ $%.2f/dozen:", getCookieQty(), getPricePerDozen());
		String line2_2 = String.format("$%.2f", calculateCost());
		String line2_3 = String.format("[Tax: $%.2f]", calculateTax());
		String outputVar = String.format("%s%n%-53s%s%17s%n", line1, line2_1, line2_2, line2_3);
		return outputVar;
	}
	public boolean isSameAs(Cookie other) {
		if (this.getName().equals(other.getName()) && this.getPricePerDozen() == other.getPricePerDozen()) {
			return true;
		}else {
			return false;
		}//end of if statement
		
	}// end of methods
}//end of cookie class
