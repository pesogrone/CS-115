/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

public class Residential extends Property{

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

}
