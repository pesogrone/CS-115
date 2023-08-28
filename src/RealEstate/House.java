/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */
package RealEstate;

import DessertShop.DessertItem;

public class House extends Residential {
	// attributes
	private double yardAcres;

	// Constructors
	public House() {
		super();
		yardAcres = 0;
	}

	public House(String sa, int z, int bed, int bath, double sq, double y) {
		super(sa, z, bed, bath, sq);
		yardAcres = y;

	}// end Of Constructors
		// Methods

	public double getYardAcres() {
		return yardAcres;
	}

	public void setYardAcres(double y) {
		yardAcres = y;
	}//end of methods

	@Override
	public double calculateApraisalPrice() {
		double Aprice = 0;
		Aprice = (this.getSize()*97.00 + this.getBeds()*10000.00 
				+ this.getBaths()*12000.00 + this.getYardAcres()* 460000);
	  //if (this.getYardAcres()>1) {
			//	Aprice += 460000.00 *(this.yardAcres -1);
			//	}
	  
	return Aprice;
		
	}
	
	// making a toString to display the listing in order
	public String toString() {
		String finalOutput = "";
		String dot1 = "....................................................................................";
		String line = String.format("%nRsidence Type: House     Adress: %s       Zip Code: %d", this.getStreetAddress(), this.getZip());
		String dot2= "\n...................................................................................";
		String line1 = String.format("%nSq Footage: %.0f", this.getSize());
		String line2_1 = String.format("%nBedrooms: %d", this.getBeds());
		String line2_2 = String.format("%nBathrooms: %d", this.getBaths() );
		String line2_3 = String.format("%nYard Size (Acres): %.1f", this.getYardAcres());
		String dot3= "\n......................................................";
		String line3 = String.format("%nAppraisal Price: $%,.2f", this.calculateApraisalPrice());
		String line4 = String.format("%nList Price: $%,.2f", this.getListPrice() );
		String dot4= "\n......................................................";
		finalOutput += String.format("%n%s%s%s%s%s%s%s%s%s%s%s%n",dot1, line, dot2, line1, line2_1, line2_2, line2_3, dot3 ,line3, line4, dot4);
		
		
		
		return finalOutput;
	}
}
