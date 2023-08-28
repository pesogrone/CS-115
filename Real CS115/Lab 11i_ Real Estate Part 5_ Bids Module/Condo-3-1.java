/*Program/Project: Lab11i
 *Name: Alex Alonso
 *Date: 03/26/2022
 *Instructor: Brother Light
 *Description: Lab 11i: Real Estate Part 5: Bids Module
 */

package RealEstate;

import java.util.HashMap;
import java.util.Set;

public class Condo extends Residential {
    int floorLvl;

    //const
    public Condo(){
        super();
        floorLvl = 0;
    }//end

    //const
    public Condo(String streetAddress, String zip, int bedCount,double bathCount, double sqFootage,int floorLvl){
        super(streetAddress,zip,bedCount,bathCount,sqFootage);
        this.floorLvl = floorLvl;
    }//end

    //getter
    public int getFloorLvl() {
        return this.floorLvl;
    }

    //setter
    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }

    @Override
    public double calculateAppraisalPrice() {
        return (getBeds() * 8000)+ (getBaths() * 10000) + (getSize() * 88) + (floorLvl * 5000);
    }

    //biddable meth
    @Override
    public HashMap<String, Double> getBids() {
        return bids;
    }

    @Override
    public Double getBid(String s) {
        return bids.get(s).doubleValue();
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
        if(bids.containsKey(s)) {
            bids.replace(s, d);
        }else {
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
        String Line6 = String.format("Floor: %,d\n", this.getFloorLvl());
        String Line7 = String.format("-------------------------------------------------------------------------\n");
        String Line8 = String.format("Appraisal Price: $%9.2f\n", this.calculateAppraisalPrice());
        String Line9 = String.format("List Price: $%9.2f\n", this.getListPrice());
        String Line10 = String.format("----------------------------------------------------------------------------------\n");
        finalOutput += String.format("\n%s\n%s%s%s%s%s%s%s%s", Line1,Line1a, Line2, Line3, Line4, Line6, Line7, Line8, Line9, Line10);

        return finalOutput;
    }
}//end.