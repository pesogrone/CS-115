/*Program/Project: Lab11i
 *Name: Alex Alonso
 *Date: 03/26/2022
 *Instructor: Brother Light
 *Description: Lab 11i: Real Estate Part 5: Bids Module
 */

package RealEstate;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class REO {

    //HashMap
    public static Listings listing = new Listings();

    public static void main(String[] args) {

        mainMenu();

    }

    private static void mainMenu() {
        String choice;
        Scanner sIn = new Scanner(System.in);

        System.out.println("----------------------------------------\n" +
                "\t\tMain Menu\n" +
                "----------------------------------------\n");
        System.out.println("1: Listings");
        System.out.println("2: Bids");
        System.out.print("\nWhat would you like to do? (1-2): ");
        choice = sIn.nextLine();

        switch (choice) {
            case "1":
                listingMenu();
                break;
            case "2":
                bidsMenu();
                break;
            case "":
                mainMenu();
                break;
            default:
                System.out.println("Please enter a valid option (1-2):");
                break;
        }//switch end


    }

    public static void listingMenu() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("----------------------------------------\n" +
                "\t\tListing Menu\n" +
                "----------------------------------------\n");
        System.out.println("1: Add Listing");
        System.out.println("2: Show Listings");
        System.out.println("3: Auto Populate Listings (Dev tool)");
        System.out.println("ENTER: Exit back to previous menu");
        System.out.print("\nWhat would you like to do? (1-3): ");
        String option = userInput.nextLine();

        switch (option) {
            case "1":
                addListingMenu();
                break;
            case "2":
                showListings();
                break;
            case "3":
                autoPopulateResidence();
                break;
            case "":
                mainMenu();
                break;
            default:
                System.out.println("Please enter a valid option (1-3):");
        } //switch end


    }

    public static void bidsMenu() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("----------------------------------------\n"+
                "\t\tBids Menu\n"+
                "----------------------------------------\n");
        System.out.println("1: Add New Bid");
        System.out.println("2: Show Existing Bids");
        System.out.println("3: Auto Populate Bids (Dev Tool)");
        System.out.println("ENTER: Exit back to previous menu");
        System.out.print("\nWhat would you like to do? (1-3): ");;
        String option = userInput.nextLine();


        switch (option) {
            //Option to add bid menu
            case "1":
                addNewBid();
                break;
            //Option to show bid menu
            case "2":
                showAvailableBids();
                break;
            //Option to auto-populate bids menu
            case "3":
                autoPopulateBidders();
                break;
            case "":
                mainMenu();
                break;
            default:
                System.out.println("Invalid option. Try again.");
        } //End of switch

    }

    public static void addListingMenu() {

        boolean marked = true;
        Scanner userInput = new Scanner(System.in);

        System.out.println("----------------------------------------\n" +
                "\t\tAdd Listing Menu\n" +
                "----------------------------------------\n");
        System.out.println("1: Add House");
        System.out.println("2: Add Condo");
        System.out.println("ENTER: Exit back to previous menu");
        System.out.print("\nWhat would you like to do? (1-2): ");
        ;
        String option = userInput.nextLine();

        switch (option) {
            //add house
            case "1":
                userAddHouse();
                break;
            //add condo
            case "2":
                userAddCondo();
                break;
            case "":
                listingMenu();
                break;
            default:
                System.out.println("Please enter a valid option (1-2):");
        } //switch end

    }

    private static void userAddHouse() {
        Scanner input = new Scanner(System.in);

        //attrib
        String address = "";
        String zipCode = "";
        int bedRooms = 0;
        double bathRooms = 0.0;
        double squareFootage = 0;
        double yards = 0.0;
        double appraisal = 0.0;
        double listPrice = 0.0;

        System.out.println("Please enter the street address for the residence: ");
        try {
            address = input.nextLine();

        } catch (Exception e) {
            System.out.println("Please enter a valid address");

        }

        System.out.println("Please enter the zip code for the residence:");
        try {
            zipCode = input.nextLine();

        } catch (Exception e) {
            System.out.println("Please enter valid zip:");

        }
        System.out.println("Please enter the number of bedrooms: ");
        try {
            bedRooms = input.nextInt();

        } catch (Exception e) {
            System.out.println("Please enter valid number of bedrooms:");

        }

        System.out.println("Please enter the number of bathrooms: ");
        try {
            bathRooms = input.nextDouble();

        } catch (Exception e) {
            System.out.println("Please enter number of bathrooms:");

        }
        System.out.println("Please enter the square footage of the residence: ");
        try {
            squareFootage = input.nextDouble();

        } catch (Exception e) {
            System.out.println("Please enter valid square footage:");

        }
        System.out.println("Please enter the size of the yards in acres: ");
        try {
            yards = input.nextDouble();

        } catch (Exception e) {
            System.out.println("Please enter valid yards in acres:");

        }

        //house create/add
        House houseListing = new House(address, zipCode, bedRooms, bathRooms, squareFootage, yards);
        listing.addListing(address, houseListing);
        appraisal = houseListing.calculateAppraisalPrice();
        DecimalFormat AppraisalPrice = new DecimalFormat("###,###,###.00");
        System.out.printf("Appraisal Price for this property is: $%s \n", AppraisalPrice.format(appraisal));
        System.out.println("Please enter the list price for the property:");
        try {
            listPrice = input.nextDouble();

        } catch (Exception e) {
            System.out.println("Please enter a valid price:");

        }
        houseListing.setListPrice(listPrice);
        System.out.printf(String.valueOf(houseListing));
        boolean check = true;
        while (check) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to add another property y/n: ");
            String option = userInput.nextLine();

            switch (option) {

                case "y":
                    addListingMenu();
                    break;

                case "n":
                    mainMenu();
                    break;
                case "":
                    mainMenu();;
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    try {
                        option = input.nextLine();

                    } catch (Exception e) {
                        System.out.println("Please enter the correct street");

                    }
            }
        }//menu end
    }

    private static void userAddCondo() {
        Scanner input = new Scanner(System.in);

        //attrib
        String address = "";
        String zipCode = "";
        int bedRooms = 0;
        double bathRooms = 0.0;
        double squareFootage = 0;
        int floorLvl = 0;
        double appraisal = 0.0;
        double listPrice = 0.0;

        System.out.println("Please enter the street address for the residence: ");
        try {
            address =input.nextLine();

        } catch (Exception e) {
            System.out.println("Please enter a valid street address");

        }

        System.out.println("Please enter the zip code for the residence:");
        try {
            zipCode = input.nextLine();

        } catch (Exception e) {
            System.out.println("Please enter a valid zip code:");

        }
        System.out.println("Please enter the number of bedrooms: ");
        try {
            bedRooms = input.nextInt();

        } catch (Exception e) {
            System.out.println("Please enter valid number of bedrooms");

        }

        System.out.println("Please enter the number of bathrooms: ");
        try {
            bathRooms = input.nextDouble();

        } catch (Exception e) {
            System.out.println("Please enter a valid number of bathrooms");

        }
        System.out.println("Please enter the square footage of the residence: ");
        try {
            squareFootage = input.nextDouble();

        } catch (Exception e) {
            System.out.println("Please enter a valid number for the square footage:");

        }
        System.out.println("Please enter the floor level of the condo: ");
        try {
            floorLvl = input.nextInt();

        } catch (Exception e) {
            System.out.println("Please enter a valid floor level:");

        }

        //condo create/add
        Condo condoListing = new Condo(address, zipCode, bedRooms, bathRooms, squareFootage, floorLvl);
        listing.addListing(address,condoListing);
        appraisal =condoListing.calculateAppraisalPrice();
        DecimalFormat AppraisalPrice = new DecimalFormat("###,###,###.00");
        System.out.printf("Appraisal Price for this property is: $%s \n", AppraisalPrice.format(appraisal));
        System.out.println("Please enter the list price for the property:");
        try {
            listPrice = input.nextDouble();

        } catch (Exception e) {
            System.out.println("Please enter a valid price:");

        }
        condoListing.setListPrice(listPrice);
        System.out.printf(String.valueOf(condoListing));
        boolean check = true;
        while (check) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please would you Like to Continue y/n: ");
            String option = userInput.nextLine();

            switch (option) {
                //add house
                case "y":
                    addListingMenu();
                    break;
                //add condo
                case "n":
                    mainMenu();
                    break;
                case "":
                    mainMenu();;
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    try {
                        option = input.nextLine();

                    } catch (Exception e) {
                        System.out.println("Please enter the correct street");

                    }
            }
        }
        condoListing.setListPrice(listPrice);
        System.out.printf(String.valueOf(condoListing));
        boolean checkone = true;
        while (checkone) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\"Would you like to add another property y/n: \n");
            String option = userInput.nextLine();

            switch (option) {
                case "y":
                    addListingMenu();
                    break;
                case "n":
                    mainMenu();
                    break;
                case "":
                    mainMenu();;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    try {
                        option = input.nextLine();

                    } catch (Exception e) {
                        System.out.println("Please enter a valid option.");

                    }
            }//menu end
        }

    }

    private static void autoPopulateResidence() {
        int currentSize = listing.getListings().size();
        House house1 = new House("34 Elm", "95129", 3, 2, 2200, .2);
        house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
        listing.addListing("34 Elm", house1);
        currentSize = currentSize+1;
        House house2 = new House("42 Hitchhikers","95129", 4, 3, 2800, .3);
        house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
        listing.addListing("42 Hitchhikers", house2);
        currentSize = currentSize+1;
        Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
        condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
        listing.addListing("4876 Industrial", condo1);
        currentSize = currentSize+1;
        House house3 = new House("2654 Oak","84062", 5, 53, 4200, .5);
        house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
        listing.addListing("2654 Oak", house3);
        currentSize = currentSize+1;
        Condo condo2 = new Condo("9875 Lexington","84063", 2, 1, 1500, 1);
        condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
        listing.addListing("9875 Lexington", condo2);
        currentSize = currentSize+1;
        Condo condo3 = new Condo("3782 Market", "84066", 3, 1, 1800, 2);
        condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
        listing.addListing("3782 Market", condo3);
        currentSize = currentSize+1;
        House house4 = new House("7608 Glenwood", "84055", 6, 3, 3900, .4);
        house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
        listing.addListing("7608 Glenwood", house4);
        currentSize = currentSize+1;
        House house5 = new House("1220 Apple", "84057", 8, 7, 7900, 1);
        house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
        listing.addListing("1220 Apple", house5);
        currentSize = currentSize+1;

        System.out.printf("%d residences have been added to the listings for testing purposes.\n",currentSize);
        listingMenu();

    }

    private static void showListings() {
        int count = 1;
        System.out.println("Current listings for REO: \n");

        for (String listings : listing.getListings().keySet()) {
            System.out.println("\nListing No: " + count + "\n");
            System.out.println(listing.getListings().get(listings));

            count++;
        }
    }

    private static void addNewBid() {

        int option = 0;
        String answer = "";
        double price = 0.0;

        Scanner sIn = new Scanner(System.in);
        ArrayList<Residential> orders = new ArrayList<Residential>();

        boolean again = false;
        while (!again) {
            System.out.println("Current Listing for REO:");
            System.out.println("");
            System.out.println("No.    Property(bids)");
            System.out.println("---------------------------------------");
            int order = 1;
            for (String i : listing.getListings().keySet()) {
                System.out.printf(order++ + ":"+listing.getListing(i)+"(%s)\n", listing.getListings().get(i).getBidCount());
                orders.add(listing.getListings().get(i));

            }

            System.out.println("ENTER: Exit back to previous menu\n");

            System.out.println("For which property would you like to add a bid?: ");
            answer = sIn.nextLine();
            if(answer.equals("")) {

                    again = false;
                    break;
            }else {
                    option = Integer.parseInt(answer);
                    System.out.println(orders.get(option - 1).toString());

                    //submit name and $bid
                    System.out.println("Please enter the name of the bidder:");
                    answer = sIn.nextLine();

                    System.out.println("Please enter the new bid: $");
                    price = sIn.nextDouble();

                    orders.get(option - 1).newBid(answer, price);

                    System.out.printf("New bid for property '%s' added.\n\n", orders.get(option - 1).getstreetAddress());
                    orders.clear();
            }


        }
      bidsMenu();
    }

    private static void autoPopulateBidders() {

        {

            //bidders names
            int i = 0;
            String[] autoBidders = { "Patric Stewart", "Walter Koenig", "William Shatner", "Leonard Nimoy",
                    "DeForect Kelley", "James Doohan", "George Takei", "Majel Barrett", "Nichelle Nichol", "Jonathan Frank",
                    "Marina Sirtis", "Brent Spiner", "Gates McFadden", "Michael Dorn", "LeVar Burton", "Wil Wheaton",
                    "Colm Meaney", "Michelle Forbes" };

            Random bidders = new Random();//generate random bid

            for (String address : listing.getStreetAddress()) {

                int seq = bidders.nextInt((autoBidders.length - 1) + 1);

                for (i = 1; i <= seq/2; i++) {
                    int index = bidders.nextInt((autoBidders.length - 1) + 1);
                    double price = listing.getListings().get(address).calculateAppraisalPrice() * (0.01 + index * 0.09);//random bid
                    listing.getListings().get(address).newBid(autoBidders[index],
                            price);
                }//for loop end
                System.out.printf("%d new bids have been added to listing %s\n", i - 1 , address);
            }//loop end
        }
        bidsMenu();
    }

    private static void showAvailableBids() {
        int choice = 0;
        String answer = "";
        double price = 0.0;

        Scanner sIn = new Scanner(System.in);
        ArrayList<Residential> orders = new ArrayList<Residential>();

        boolean again = false;
        while(!again) {
            System.out.println("Current Listing for REO:");
            System.out.println("");
            System.out.println("No.    Property(bids)");
            System.out.println("---------------------------------------");
            int order = 1;
            for (String address : listing.getStreetAddress()) {

                System.out.printf("%d:     %s (%d)\n", order++, address, listing.getListings().get(address).getBidCount());
                orders.add(listing.getListings().get(address));
            }

            System.out.println("ENTER: Exit back to previous menu");
            System.out.println("");

            System.out.println("For which property would you like to add a bid?: ");
            answer = sIn.nextLine();
            switch (answer) {

                case "":
                    again = true;
                    break;

                default:
                    choice = Integer.parseInt(answer);
                    System.out.println(orders.get(choice-1).toString());

                    System.out.println("Current bids for this listing: ");
                    System.out.println("--------------------------------------------");
                    System.out.println("        Bidder            Bid");
                    System.out.println("--------------------------------------------");

                    for (String name : orders.get(choice-1).getBidders()) {
                        System.out.printf("%-5s         $%,.2f%n", name, orders.get(choice-1).getBid(name));
                    }//loop end

            }//switch end
            orders.clear();
        }//while loop end
    }


}//end.