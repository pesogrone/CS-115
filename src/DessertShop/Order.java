package DessertShop;

import java.util.ArrayList;

public class Order implements Payable {
	// Attribute
	private ArrayList<DessertItem> order;
	public PayType payMethod;

	// Constructors
	public Order() {
		order = new ArrayList<DessertItem>();
		payMethod = PayType.CASH;
	}

	// Method
	public ArrayList<DessertItem> getOrderList() {
		return order;
	}

	public void addDessertItem(DessertItem di) {

		if (di instanceof Candy) {
			for (DessertItem d : getOrderList()) {
				if (d instanceof Candy) {
				if (((Candy) di).isSameAs((Candy) d)) {
					((Candy) d).setCandyWeight(((Candy) d).getCandyWeight() + ((Candy) di).getCandyWeight());
					return;
				}

			}

		}
		}
		// Cookie
		else if (di instanceof Cookie) {
			for (DessertItem d : getOrderList()) {
				if (d instanceof Cookie) {
				if (((Cookie) di).isSameAs((Cookie) d)) {
					((Cookie) d).setCookieQty(((Cookie) d).getCookieQty() + ((Cookie) di).getCookieQty());
					return;

				}
			}
		}
			} 
		order.add(di);
		
	}

	public int itemCount() {
		return order.size();
	}

	public double orderCost() {
		double totalcost = 0;
		for (DessertItem c : order) {
			totalcost = totalcost + c.calculateCost();

		} // end of for loop
		return totalcost;
	}// end of order Cost method

	public PayType getPayType() {
		return payMethod;
	}

	public void setPayType(PayType pt) {
		payMethod = pt;
	}

	public double orderTax() {
		double totaltax = 0;
		for (DessertItem c : order) {
			totaltax = totaltax + c.calculateTax();
		}
		return totaltax;
	}

	public String toString() {
		String finalOutput = "";
		finalOutput += ".......................................Receipt.................................";
		for (DessertItem d : order) {
			finalOutput += d.toString();

		}
		finalOutput += "..................................................................................";
		String line1 = String.format("%nTotal number of items in order: %d", itemCount());
		String line2_1 = String.format("%s", "Order Subtotals:");
		String line2_2 = String.format("$%.2f", orderCost());
		String line2_3 = String.format("[Tax: $%.2f]%n", orderTax());
		String line3_1 = String.format("%s", "Order Total:");
		String line3_2 = String.format("$%.2f%n", (orderCost() + orderTax()));
		finalOutput += String.format("%s%n%-53s%-10s%s%n%-53s%s%n", line1, line2_1, line2_2, line2_3, line3_1, line3_2);

		finalOutput += "..................................................................................";
		finalOutput += String.format("%n%nPaid for with %s%n%n", getPayType());
		finalOutput += "..................................................................................";
		return finalOutput;
	}// end of methods

}
