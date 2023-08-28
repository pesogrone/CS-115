/*Program/Project: Lab11i
 *Name: Alex Alonso
 *Date: 03/26/2022
 *Instructor: Brother Light
 *Description: Lab 11i: Real Estate Part 5: Bids Module
 */

package RealEstate;

import java.util.HashMap;

public abstract class Residential extends Property implements Biddable {

    //HashMap
    HashMap<String, Double> bids= new HashMap<>();

    int bedCount;
    double bathCount;
    double sqFootage;

     public Residential(){
         super();
         this.bedCount = 0;
         this.bathCount = 0.0;
         this.sqFootage = 0.0;

     }
    public Residential(String streetAddress,String zip,int bedCount, double bathCount, double sqFootage) {
        super(streetAddress,zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }

    //Getters
    public int getBeds() {
        return this.bedCount;
    }

    public double getBaths() {
        return this.bathCount;
    }

    public double getSize() {
        return this.sqFootage;
    }

    //Setters
    public void setBeds(int bedCount) {
        this.bedCount = bedCount;
    }

    public void setBaths(double bathCount) {
        this.bathCount = bathCount;
    }

    public void setSize(int sqFootage) {
        this.sqFootage = sqFootage;
    }

    @Override
    public abstract double calculateAppraisalPrice();

}//end.
