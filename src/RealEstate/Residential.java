/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */
package RealEstate;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.hamcrest.core.StringContains;

public abstract class Residential extends Property implements Biddable {
	// attributes
	private int bedCount;
	private int bathCount;
	private double sqFootage;
	HashMap<String, Double> bids = new HashMap<>();
	

	// Constructors
	public Residential() {
		super();
		bedCount = 0;
		bathCount = 0;
		sqFootage = 0;

	}

	public Residential(String sa, int z, int bed, int bath, double sq) {
		super(sa, z);
		bedCount = bed;
		bathCount = bath;
		sqFootage = sq;

	}// end Of Constructors
		// Methods

	public int getBeds() {
		return bedCount;
	}

	public int getBaths() {
		return bathCount;

	}

	public double getSize() {
		return sqFootage;
	}

	public void setBeds(int bed) {
		bedCount = bed;
	}

	public void setBaths(int bath) {
		bathCount = bath;
	}

	public void setSize(double sq) {
		sqFootage = sq;
	}
	
	@Override
	public HashMap<String, Double> getBids(){
		return bids;
	}
	@Override
	public Double getBid(String bidder) {
		return bids.get(bidder);
	}
	@Override
	public Set<String> getBidders(){
		return bids.keySet();
	}
	@Override
	public int getBidCount() {
		return bids.size();
	}
	@Override
	public void newBid(String key, Double value) {
		
				if(bids.containsKey(key)) {
					bids.replace(key, value);
				}
				
				else {
					bids.put(key, value);
				}
		
	}public String detailedBids() {
		String Yes = "";
		ArrayList<String> bidders = new ArrayList<String>(bids.keySet());
		DecimalFormat formatValue = new DecimalFormat("$###,###,###.00");
		if (bids.size()==0) return "";
		System.out.println("Current bids for this listing: ");
		System.out.println("---------------------------------------------");
		System.out.printf("%10s%20s\n","Bidder","Bids");
		System.out.println("---------------------------------------------\n");

		
		for (String b : bidders) Yes += String.format("%6s%18s\n", b, formatValue.format(bids.get(b)));
		return Yes;
	}
	
	public abstract double calculateApraisalPrice();
	
	// end of methods

}
