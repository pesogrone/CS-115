/*Program/Project: Lab11i
 *Name: Alex Alonso
 *Date: 03/26/2022
 *Instructor: Brother Light
 *Description: Lab 11i: Real Estate Part 5: Bids Module
 */

package RealEstate;

import java.util.HashMap;
import java.util.Set;

public class House extends Residential{
    double yardAcres;

    //const
    public House(){
        super();
        yardAcres = 0.0;

    }//end

    //const
    public House(String streetAddress, String zip, int bedCount,double bathCount, double sqFootage, double yardAcres){
        super(streetAddress,zip,bedCount,bathCount,sqFootage);
        this.yardAcres = yardAcres;

    }//end

    //getter
    public double getYardAcres() {
        return this.yardAcres;
    }

    //setter
    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }

    @Override
    public double calculateAppraisalPrice() {
        return (getBeds()* 10000) + (getBaths() * 12000) + (getSize() * 97) + (yardAcres * 460000 );
    }
    protected void setAppraisalPrice(double appraisalPrice) {
        super.setAppraisalPrice(appraisalPrice);
    }

    //biddable meth
    @Override
    public HashMap<String, Double> getBids() {
        return bids;
    }//hashmap end

    @Override
    public Double getBid(String s) {
        return bids.get(s);
    }

    @Override
    public Set<String> getBidders() {
        return bids.keySet();
    }

    @Override
    public int getBidCount() {
        return bids.size();
    }

    @Override
    public void newBid(String s, Double d) {
        if (bids.containsKey(s)) {
            bids.replace(s, d);
        } else {
            bids.put(s, d);
        }//if end
    }
    public String toString() {

        String finalOutput = "";

        finalOutput += "----------------------------------------------------------------------------------";

        String Line1 = String.format("Residence Type: House  Address: %s Zip Code: %s\n", this.getstreetAddress(), this.getZip());

        String Line1a = String.format("----------------------------------------------------------------------------------\n");

        String Line2 = String.format("Sq Footage: %9.2f\n", this.getSize());
        String Line3 = String.format("Bedrooms: %,d \n", this.getBeds());
        String Line4 = String.format("Bathrooms %9.2f \n", this.getBaths());
        String Line6 = String.format("Yard Size (Acres): %9.2f\n", this.getYardAcres());
        String Line7 = String.format("-------------------------------------------------------------------------\n");
        String Line8 = String.format("Appraisal Price: $%9.2f\n", this.calculateAppraisalPrice());
        String Line9 = String.format("List Price: $%9.2f\n", this.getListPrice());
        String Line10 = String.format("----------------------------------------------------------------------------------\n");
        finalOutput += String.format("\n%s\n%s%s%s%s%s%s%s%s", Line1,Line1a, Line2, Line3, Line4, Line6, Line7, Line8, Line9, Line10);

        return finalOutput;
    }


    }//end
