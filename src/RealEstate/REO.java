package RealEstate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import DessertShop.GetValid;

public class REO {
	// declaring the variables
	private static Listings reoListings = new Listings();
	static Residential res;

	public static void main(String[] args) {
		Scanner sIn = new Scanner(System.in);
		boolean valid = false;
		String input;

		// while loop to display the menu
		while (!valid) {
			System.out.println("..............................................");
			System.out.println("                 Main Menu");
			System.out.println("..............................................");
			System.out.println("1: Listings");
			System.out.println("2: Bids");
			System.out.println("");
			System.out.print("What would you like to do? (1 - 2):");
			input = sIn.nextLine();
			if (input.equalsIgnoreCase("")) {
				System.out.println("That is not a valid answer, please choose 1 or 2");
			} else {
				switch (input) {
				case "1":
					input = listingmenu();
					break;
				case "2":
					input = Bidsmenu();
					break;
				default:
					System.out.println("Invalid response:  Please enter a choice from the menu (1-2)");
					break;
				}
			}

		}

	}

	// Bids menu
	private static String Bidsmenu() {
		Scanner in = new Scanner(System.in);
		String bids;
		boolean done = false;
		while (!done) {
			System.out.println("");
			System.out.println("..............................................");
			System.out.println("                 Bids Menu");
			System.out.println("..............................................");
			System.out.println("1. Add New Bid");
			System.out.println("2. Show Existing Bids");
			System.out.println("3. Auto Populate Bids(Dev tool)");
			System.out.println("ENTER: Exit back to the previous menu.");
			System.out.println("");
			System.out.print("What would you like to do? (1-3):");
			bids = in.nextLine();
			// if statement with switch statement to recognize the input
			if (bids.equalsIgnoreCase("")) {

				return bids;

			} else {
				switch (bids) {
				case "1":
					bids = addbid();
					break;
				case "2":
					showbids();
					break;
				case "3":
					populatebids();
					break;
				default:
					System.out.println("Invalid response:  Please enter a choice from the menu (1-3)");
					break;
				}
			}

		}
		return null;
	}

	private static String addbid() {
		Scanner in = new Scanner(System.in);
		List<Residential> properties = new ArrayList<>(reoListings.getResidences());
		
        String Input;
        boolean valid = false;
        while(!valid) {
        	int index = 0;
		String tHeader = "\n" + "Current Listings for REO:\n" + "No.      Property (bids)\n"+ "\n"
				+ "---------------------------\n" ;

		System.out.println(tHeader);

		for (Residential r : properties) {
			System.out.println((index + 1) + ": " + r.getStreetAddress() + " (" + r.getBidCount() + ")");
			index += 1;
		}
		System.out.println("ENTER: Exit back to previous menu\n");

		System.out.print("\nFor which property would you like to add a bid?: ");
		Input = in.nextLine();
		
		if (Input.equalsIgnoreCase("")) {
			valid = true;
			
		}else {
			index = Integer.parseInt(Input);
		System.out.println(properties.get(index - 1));
		System.out.println(properties.get(index - 1).detailedBids());

		System.out.print("\nPlease enter the name of the bidder: ");
		String bidName = in.nextLine();
		System.out.print("\nPlease enter the new bid: ");
		String bidValue = in.nextLine();
		properties.get(index - 1).newBid(bidName, Double.parseDouble(bidValue));
		System.out.println("\nNew bid for property '" + properties.get(index - 1).getStreetAddress() + "' added.");
          
			
		} }return null;}

	private static void showbids() {
		Scanner in = new Scanner(System.in);
		String Input;
		boolean valid = false;
		
		List<Residential> properties = new ArrayList<>(reoListings.getResidences());
		 while(!valid) {
			 int index = 0;

		String tHeader = "\n" + "Current Listings for REO:\n" + "No.      Property (bids)\n"+"\n"
				+ "---------------------------\n" ;

		System.out.println(tHeader);

		for (Residential r : properties) {
			System.out.println((index + 1) + ": " + r.getStreetAddress() + " (" + r.getBidCount() + ")");
			index += 1;
		}
		System.out.println("ENTER: Exit back to previous menu\n");

		System.out.print("\nFor which property would you like to see the current bids? ");
		Input = in.nextLine();
		if (Input.equalsIgnoreCase("")) {
			valid = true;
			
		}else {
			index = Integer.parseInt(Input);
		System.out.println(properties.get(index - 1));
		System.out.println("\n\n");
		System.out.println(properties.get(index - 1).detailedBids());
	}}}

	private static void populatebids() {
		List<Residential> residences = new ArrayList<>(reoListings.getResidences());
        Random r = new Random();

        String[] autoBidders= {"Patric Stewart","Walter Koenig","William Shatner","Leonard Nimoy","DeForect Kelley","James Doohan","George Takei","Majel Barrett","Nichelle Nichol","Jonathan Frank"
                ,"Marina Sirtis","Brent Spiner","Gates McFadden","Michael Dorn","LeVar Burton","Wil Wheaton","Colm Meaney","Michelle Forbes"};

        residences.forEach(random -> {
            int numberOfBids = r.nextInt(6) + 1;
            IntStream
                    .range(0, numberOfBids)
                    .map(i -> r.nextInt(autoBidders.length - 1) + 1)
                    .forEach(index -> random.newBid(autoBidders[index], random.calculateApraisalPrice() * (1 + (Math.random() + 0.2) / 4)));
            System.out.println(numberOfBids + " new bids have been added to listing " + random.getStreetAddress());
        });
    

	}

	// listing menu,
	public static String listingmenu() {
		Scanner in = new Scanner(System.in);
		String listing;
		boolean list = false;
		while (!list) {
			System.out.println("");
			System.out.println("..............................................");
			System.out.println("                  Listing Menu");
			System.out.println("..............................................");
			System.out.println("1. Add Listings");
			System.out.println("2. Show Listings");
			System.out.println("3. Auto Populate Listings(Dev tool)");
			System.out.println("ENTER: Exit back to the previous menu.");
			System.out.println("");
			System.out.print("What would you like to do? (1-3):");
			listing = in.nextLine();
			// if statement and switch statement to recognize input
			if (listing.equalsIgnoreCase("")) {
				return listing;

			} else {
				switch (listing) {
				case "1":
					listing = addlisting();
					break;
				case "2":
					showlisting();
					break;
				case "3":
					populateli();
					break;
				default:
					System.out.println("Invalid response:  Please enter a choice from the menu (1-2)");
					break;
				}
			}

		}
		return null;
	}

	// auto populate listings
	private static void populateli() {
		int currentSize = reoListings.getListings().size();
		House house1 = new House("34 Elm", 95129, 3, 2, 2200, .2);
		house1.setListPrice(house1.calculateApraisalPrice() * 1.1);
		reoListings.addListing("34 Elm", house1);
		House house2 = new House("42 Hitchhikers", 95136, 4, 3, 2800, .3);
		house2.setListPrice(house2.calculateApraisalPrice() * 1.1);
		reoListings.addListing("42 Hitchhikers", house2);
		Condo condo1 = new Condo("4876 Industrial", 95177, 3, 1, 1800, 3);
		condo1.setListPrice(condo1.calculateApraisalPrice() * 1.1);
		reoListings.addListing("4876 Industrial", condo1);
		House house3 = new House("2654 Oak", 84062, 5, 53, 4200, .5);
		house3.setListPrice(house3.calculateApraisalPrice() * 1.1);
		reoListings.addListing("2654 Oak", house3);
		Condo condo2 = new Condo("9875 Lexington", 84063, 2, 1, 1500, 1);
		condo2.setListPrice(condo2.calculateApraisalPrice() * 1.1);
		reoListings.addListing("9875 Lexington", condo2);
		Condo condo3 = new Condo("3782 Market", 84066, 3, 1, 1800, 2);
		condo3.setListPrice(condo3.calculateApraisalPrice() * 1.1);
		reoListings.addListing("3782 Market", condo3);
		House house4 = new House("7608 Glenwood", 84055, 6, 3, 3900, .4);
		house4.setListPrice(house4.calculateApraisalPrice() * 1.1);
		reoListings.addListing("7608 Glenwood", house4);
		House house5 = new House("1220 Apple", 84057, 8, 7, 7900, 1);
		house5.setListPrice(house5.calculateApraisalPrice() * 1.1);
		reoListings.addListing("1220 Apple", house5);
		
		System.out.print("\n8 residences have been added to the listings for testing purposes.");

	}
	// Add listings menu

	private static String addlisting() {
		Scanner in = new Scanner(System.in);
		boolean done = false;
		String add;
		while (!done) {
			System.out.println("");
			System.out.println("..............................................");
			System.out.println("                Add Listing Menu");
			System.out.println("..............................................");
			System.out.println("1. Add House");
			System.out.println("2. Add Condo");
			System.out.println("");
			System.out.println("ENTER: Exit back to the previous menu.");
			System.out.println("");
			System.out.print("What would you like to do? (1-2):");
			add = in.nextLine();
			switch (add) {
			case "1":
				add = addHouse();
				break;
			case "2":
				add = addCondo();
				break;
			case "":
				done = true;
				break;
			default:
				System.out.println("Invalid response:  Please enter a choice from the menu (1-2)");
				break;
			}

		}
		return null;
	}

	// adding a house to the listings,
	private static String addHouse() {
		// declare variables
		String input;
		Scanner In = new Scanner(System.in);

		// set the input to have input validation
		System.out.print("Please enter the street address for the residence:");
		input = In.nextLine();

		int z = GetValid.getValidInt("Please enter the zip code for the residence:",
				"Invalid response. Only whole numbers are aceptable");
		int numbed = GetValid.getValidInt("Please enter the number of bedrooms:", "Invalid response only numbers");
		int numbath = GetValid.getValidInt("Please enter the number of bathrooms:", "Invalid response only numbers");
		int sqf = GetValid.getValidInt("Please enter the square footage of the residence:",
				"Invalid response only numbers");
		double yards = GetValid.getValidDouble("Please enter the size of the yard in acres:",
				"Invalid response only numbers");
		// add the input to the House listings
		House house = new House(input, z, numbed, numbath, sqf, yards);
		System.out.printf("\nAppraisal Price for this property is: %,.2f", house.calculateApraisalPrice());
		double li = GetValid.getValidDouble("\nPlease enter the List Price for the property:",
				"Invalid response only numbers");
		house.setListPrice(li);
		// add everythings to the arraylist listing
		reoListings.addListing(input, house);
		System.out.println("");
		System.out.println("You have created a new listing!");
		System.out.println(house);
		return null;
	}

	// add a condo to the listings
	private static String addCondo() {
		// declaring variables
		String input;
		Scanner In = new Scanner(System.in);
		// making input validation
		System.out.print("Please enter the street address for the residence:");
		input = In.nextLine();

		int z = GetValid.getValidInt("Please enter the zip code for the residence:",
				"Invalid response. Only whole numbers are aceptable");
		int numbed = GetValid.getValidInt("Please enter the number of bedrooms:", "Invalid response only numbers");
		int numbath = GetValid.getValidInt("Please enter the number of bathrooms:", "Invalid response only numbers");
		int sqf = GetValid.getValidInt("Please enter the square footage of the residence:",
				"Invalid response only numbers");
		int fl = GetValid.getValidInt("Please enter the floor level of the condo:", "Invalid response only numbers");
		// adding the inputs to the condo listings
		Condo condo = new Condo(input, z, numbed, numbath, sqf, fl);
		System.out.printf("\nAppraisal Price for this property is: %,.2f", condo.calculateApraisalPrice());
		double li = GetValid.getValidDouble("\nPlease enter the List Price for the property:",
				"Invalid response only numbers");
		condo.setListPrice(li);
		// adding everything to the array
		reoListings.addListing(input, condo);
		System.out.println("");
		System.out.println("You have created a new listing!");
		System.out.println(condo);
		return null;
	}

	// showing the listing of the arraylist
	private static void showlisting() {
		int counter = 1;
		System.out.println("");
		System.out.println("Current Listings for REO:");
		for (String Key : reoListings.getListings().keySet()) {
			System.out.printf("\n Listing No: %d", counter);
			System.out.println(reoListings.getListings().get(Key));
			counter++;
		}

	}

}
