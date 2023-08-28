/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */
package RealEstate;

public abstract class Property {
	// attributes
	private String streetAddress;
	private int zip;
	private double listPrice;
	private double apraisalPrice;

	// Constructors
	public Property() {
		streetAddress = "";
		zip = 0;
		listPrice = 0;
		apraisalPrice = 0;
	}

	public Property(String sa, int z) {
		streetAddress = sa;
		zip = z;
		
	}// end Of Constructors
		// Methods

	public String getStreetAddress() {
		return streetAddress;
	}

	public int getZip() {
		return zip;
	}

	public double getListPrice() {
		return listPrice;
	}

	public double getApraisalPrice() {
		return apraisalPrice;
	}

	public void setStreetAddress(String sa) {
		streetAddress = sa;
	}

	public void setZip(int z) {
		zip = z;

	}public void setListPrice(double li){
		listPrice = li;
		
	}protected void setApraisalPrice(double ap) {
		apraisalPrice = ap;
	} 
	public abstract double calculateApraisalPrice();
	//end of methods

}
