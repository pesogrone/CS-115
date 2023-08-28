/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */

package RealEstate;

public class Condo extends Residential {
	// attributes
	private int floorLvl;


	
	// Constructors
	public Condo() {
		super();
		floorLvl = 0;
	}

	public Condo(String sa, int z, int bed, int bath, double sq, int f) {
		super(sa, z, bed, bath, sq);
		floorLvl = f;
	}// end Of Constructors
	
		// Methods

	public int getFloorLvl() {
		return floorLvl;
	}

	public void setFloorLvl(int f) {
		floorLvl = f;
	}// end of method

	// adding the calculation for the amenities 
	public double calculateApraisalPrice() {
		double Aprice = 0;
		Aprice = (this.getSize()*88.00 + this.getBeds()*8000.00 
				+ this.getBaths()*10000.00);
	 if (this.getFloorLvl()>1) {
			Aprice += (this.getFloorLvl()-1) * 5000;
				}
	  
	return Aprice;
	}
	// making a toString to display the listing in order
	public String toString() {
		String finalOutput = "";
		String dot1 = "....................................................................................";
		String line = String.format("%nRsidence Type: Condo     Adress: %s       Zip Code: %d", this.getStreetAddress(), this.getZip());
		String dot2= "\n..................................................................................";
		String line1 = String.format("%nSq Footage: %.0f", this.getSize());
		String line2_1 = String.format("%nBedrooms: %d", this.getBeds());
		String line2_2 = String.format("%nBathrooms: %d", this.getBaths() );
		String line2_3 = String.format("%nFloor: %d", this.getFloorLvl());
		String dot3= "\n..................................................................................";
		String line3 = String.format("%nAppraisal Price: $%,.2f", this.calculateApraisalPrice());
		String line4 = String.format("%nList Price: $%,.2f", this.getListPrice() );
		String dot4= "\n..................................................................................";
		finalOutput += String.format("%n%s%s%s%s%s%s%s%s%s%s%s%n",dot1, line, dot2, line1, line2_1, line2_2, line2_3, dot3 ,line3, line4, dot4);
		
		
		
		return finalOutput;
	}

}
