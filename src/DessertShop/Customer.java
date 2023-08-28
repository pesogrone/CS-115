package DessertShop;

import java.util.ArrayList;

public class Customer {
    //Attributes
	String custName;
	private ArrayList<Order> orderHistory;
	 int custID;
	 static int nextCustID = 1000;
	//Constructors
	public Customer(String n) {
		orderHistory = new ArrayList<Order>();
		custName = n;
		
		custID = nextCustID;
		nextCustID ++;
		
		
	}
	//Methods
	public String getName() {
		
		return custName;
	}
	public int getId() {
		
		return custID;
		
	}
	public ArrayList<Order> getOrderHistory(){
		return orderHistory;
	}
	public void setName(String n) {
		custName = n;
		
		
	}
	public void addToHistory(Order o) {
		orderHistory.add(o);
	}
}
