/*
 * Program: Lab3a - Dessert Shop, Part 1—Class Structure
 * Names: Porter Sykes & Mijhail Britos
 * Date: 09/27/2022
 * Instructor: Brother Light
 * Description: Dessert Shop superclass and subclass
 */
package DessertShop;

public class Sundae extends IceCream{

	//Attributes
	private String toppingName;
	private double toppingPrice;
	
	//Constructors
	public Sundae () {
		super();
		toppingName = "";
		toppingPrice = 0;
		packaging = "";
	}
	
	public Sundae (String n, int sc, double pps, String tn, double tp) {
		super(n, sc, pps);
		toppingName = tn;
		toppingPrice = tp;
		packaging = "Boat";
	}//end of constructors
	
	//Methods
	public String getToppingName() {
		return toppingName;
	}
	
	public void setToppingName(String tn) {
		toppingName = tn;
	}
	
	public double getToppingPrice() {
		return toppingPrice;
	}
	
	public void setToppingPrice(double tp) {
		toppingPrice = tp;
	}
	public double calculateCost() {
		return (toppingPrice + (this.getPricePerScoop()*this.getScoopCount()));
		}public String toString() {
			String line1 = String.format("%n%s %s sundae (%s)", getToppingName(), getName(),packaging);
			String line2_1 = String.format("%5d scoops of %s ice cream @ $%.2f/scoop%n", getScoopCount(), getName(), getPricePerScoop());
			String line2_2 = String.format("%s topping @$%.2f:", getToppingName(), getToppingPrice());
			String line2_3 = String.format("$%.2f", calculateCost());
			String line2_4 = String.format("[Tax: $%.2f]", calculateTax());
			String outputVar = String.format("%s%n%-53s%17s%29s%17s%n", line1, line2_1, line2_2, line2_3, line2_4);
			return outputVar;
		}// end of methods
	
	
	}//end of class
	
	
