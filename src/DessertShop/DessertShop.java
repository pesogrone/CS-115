/*
 *  Program: Lab6b - 
 * Names: Porter Sykes & Mijhail Britos
 * Date: 10/25/2022
 * Instructor: Brother Light
 * Description: Comparable method
 */
package DessertShop;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import DessertShop.Payable.PayType;
import DessertShop.GetValid;

public class DessertShop {
	private static HashMap<String, Customer> customerDB = new HashMap<>();

	
	public static void main(String[] args) {
		// Attributes

		boolean closed = false;
		while (!closed) {

			Order order1 = new Order();
			Customer newCustomer = new Customer(null);
			Scanner sIn = new Scanner(System.in);
			String choice;
			String answer;
			String name;
			DessertItem orderItem;
			String paymentMethod;
			boolean done = false;

			while (!done) {
				System.out.println("\n1: Candy");
				System.out.println("2: Cookie");
				System.out.println("3: Ice Cream");
				System.out.println("4: Sundae");
				System.out.println("5: Admin Module");

				System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
				choice = sIn.nextLine();

				if (choice.equals("")) {
					// Loops to determine type of payment
					Payable.PayType payMethod = null;
					boolean valid = false;
					// Code to add customer to hash map
					System.out.println("");
					System.out.print("What is the customer's name?");
					name = sIn.nextLine();
					if (customerDB.containsKey(name)) {
						newCustomer = customerDB.get(name);
						customerDB.get(name).addToHistory(order1);
					} else {
						newCustomer.setName(name);
						
						customerDB.put(name, newCustomer);
						customerDB.get(name).addToHistory(order1);
						
					} // end of if for HashMap
					while (!valid) {
						
						System.out.print("What form of payment will be used? (CASH, CARD, PHONE)");
						paymentMethod = sIn.nextLine();
						for (Payable.PayType pt : Payable.PayType.values()) {
							if (paymentMethod.equalsIgnoreCase(pt.name())) {
								valid = true;
								done = true;
								payMethod = pt;
								switch (pt.name()) {
								case "CASH":
									order1.setPayType(pt);
									break;
								case "CARD":
									order1.setPayType(pt);
									break;
								case "PHONE":
									order1.setPayType(pt);
									break;
								}
							} // end of if
						} // end of for
						if (!valid) {
							System.out.println("That's not a valid form of payment.");
						}
					} // end of while (!valid)
				} else {
					switch (choice) {
					case "1":
						orderItem = userPromptCandy();
						order1.addDessertItem(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "2":
						orderItem = userPromptCookie();
						order1.addDessertItem(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "3":
						orderItem = userPromptIceCream();
						order1.addDessertItem(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "4":
						orderItem = userPromptSundae();
						order1.addDessertItem(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "5":
						userPromptAdmin();
						break;
					default:
						System.out.println("Invalid response:  Please enter a choice from the menu (1-5)");
						break;
					}// end of switch (choice)
				} // end of if (choice.equals(""))
			} // end of while (!done)

			System.out.println("\n");

			// Additions to the order Arrray List
			Candy c1 = new Candy("Candy Corn", 1.5, .25);
			order1.addDessertItem(c1);

			Candy c2 = new Candy("Gummy Bears", .25, .35);
			order1.addDessertItem(c2);

			Cookie ck1 = new Cookie("Chocolate Chip", 6, 3.99);
			order1.addDessertItem(ck1);

			IceCream ic1 = new IceCream("Pistachio", 2, .79);
			order1.addDessertItem(ic1);

			Sundae s1 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
			order1.addDessertItem(s1);

			Cookie ck2 = new Cookie("Oatmeal Raisin", 2, 3.45);
			order1.addDessertItem(ck2);

			// end of additions to the order Array List

			// for loop to print DessertItem contents
			// for (DessertItem d : order1.getOrderList()) {
			// System.out.printf("%-25s$%-8.2f[Tax: $%.2f]%n", d.getName(),
			// d.calculateCost(), d.calculateTax());
			// } // end of for loop
			// System.out.println("..........................................................");
			// System.out.printf("%nOrder Subtotals%-10s$%-8.2f[Tax: $%.2f]%n", ":",
			// order1.orderCost(), order1.orderTax());
			// System.out.printf("%nOrder Total%-14s$%-8.2f%n", ":", (order1.orderCost() +
			// order1.orderTax()));
			// System.out.printf("%nTotal number of items in order: %d",
			// order1.itemCount());
			Collections.sort(order1.getOrderList());
			System.out.println(order1);
			//Display customer information
			String customerInfo = "";
			String customerName = String.format("%nCustomer Name:%s", newCustomer.getName());
			String customerID = String.format("Customer ID:%s", newCustomer.getId());
			String totalOrders = String.format("Total Orders:%s", newCustomer.getOrderHistory().size());
			customerInfo += String.format("%-25s%-20s%s%n", customerName, customerID, totalOrders);
			System.out.println(customerInfo);
			done = false;
			while (!done) {
				System.out.println("Please hit enter to start a new order");
				answer = sIn.nextLine();

				if (answer.equals("")) {
					done = true;
				} // end of if

			} // end of second while done
		} // end of while done
	}// end of main()

	

	private static DessertItem userPromptCandy() {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.print("Enter the Type of Candy:" + " ");
		name = in.nextLine();

		double quantity = GetValid.getValidDouble("Enter the quantity ",
				"Invalid response. Only whole numbers are aceptable");
		double price = GetValid.getValidDouble("Enter the price per dozen ", "Invalid response only numbers");
		Candy orderItem = new Candy(name, quantity, price);
		return orderItem;
	}// end of Candy

	private static DessertItem userPromptCookie() {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.print("Enter the type of cookie: ");
		name = in.nextLine();

		int quantity = GetValid.getValidInt("Enter the quantity purchased: ",
				"Invalid response. Only whole numbers are aceptable");
		double price = GetValid.getValidDouble("Enter the price per dozen: ", "Invalid response only numbers");
		Cookie orderItem = new Cookie(name, quantity, price);

		return orderItem;
	}// end of cookie

	private static DessertItem userPromptIceCream() {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.print("Enter the type of Ice Cream: ");
		name = in.nextLine();
		// String type = GetValid.getValidYN("Enter the Type of Candy", "Invalid
		// response. Only whole numbers are acceptable.");
		int quantity = GetValid.getValidInt("Enter the number of scoops: ",
				"Invalid response. Only whole numbers are aceptable");
		double price = GetValid.getValidDouble("Enter the price per scoop: ", "Invalid response only numbers");
		IceCream orderItem = new IceCream(name, quantity, price);

		return orderItem;
	}// end of IceCream

	private static DessertItem userPromptSundae() {
		Scanner in = new Scanner(System.in);
		String name;
		String topping;
		System.out.print("Enter the type of Ice Cream: ");
		name = in.nextLine();

		int quantity = GetValid.getValidInt("Enter the number of scoops: ",
				"Invalid response. Only whole numbers are aceptable");
		double price = GetValid.getValidDouble("Enter the price per scoop: ", "Invalid response only numbers");
		System.out.print("Enter the kind of topping used: ");
		topping = in.nextLine();
		double pricet = GetValid.getValidDouble("Enter the price for the topping: ", "Invalid response only numbers");
		Sundae orderItem = new Sundae(name, quantity, price, topping, pricet);

		return orderItem;
	}// end of Sundae
	// Admin Method
	private static void userPromptAdmin() {
		//Attributes
				Scanner in = new Scanner(System.in);
				boolean done = false;
				String choice;
				boolean valid = false;
				String custname;
				
				while (!done) {
					System.out.println("\n1: Shop Customer List");
					System.out.println("2: Customer Order History");
					System.out.println("3: Best Customer");
					System.out.println("4: Exit Admin Module");
					
					System.out.print("\nWhat would you like do? (1-4, Enter for done): ");
					choice = in.nextLine();
					switch (choice) {
					case "1":
						
						customerDB.forEach((name, id)->  
					
						  System.out.printf("Customer Name: %1s   Customer ID:%s%n", name, id.getId()));
							break;
					case "2":
						while(!valid) {
							System.out.println("Enter the name of the customer:");
							custname = in.nextLine();
						if(customerDB.containsKey(custname)) {
						   System.out.printf("Customer Name:%sCustomer ID:%s%n", custname, customerDB.get(custname).getId());	
						System.out.println("........................................................................\n");
						
						for (int i = 0; i < customerDB.get(custname).getOrderHistory().size(); i++) {
						    System.out.printf("Order #: %d%n%n", i+1);      
							System.out.printf("%s%n%n", customerDB.get(custname).getOrderHistory().get(i));
						     valid = true;
						}
						}else {
							System.out.println("Error, please enter the customer's name");
							}
						}
						
						break;
					case "3":
						 int max = 0;
						   String bestCustomer = "";
						   for (String name : customerDB.keySet()) {
							   if (customerDB.get(name).getOrderHistory().size() > max) {
								   max = customerDB.get(name).getOrderHistory().size();
								   bestCustomer = name;
							   }
						   }
						   System.out.println("........................................................................");
						   System.out.printf("The Dessert Shop's most valued customer is: %s%s%n", bestCustomer, "!");
						   System.out.println("........................................................................");
						   break;
					case "4":
						
						done = true;
						break;
						
					default:
						System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
						break;
					}// end of switch (choice)
				}//end of admin while loop
		
	}



	protected void checkSubclass() {
		// TODO Auto-generated method stub
		
	}
}
