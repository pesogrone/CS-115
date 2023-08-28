/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

public class House extends Residential{
    double yardAcres;

    //Const
    public House(){
        super();
        yardAcres = 0.0;

    }//end

    //Const
    public House(String streetAddress, String zip, int bedCount,double bathCount, double sqFootage, double yardAcres){
        super(streetAddress,zip,bedCount,bathCount,sqFootage);
        this.yardAcres = yardAcres;

    }//end

    //Getter
    public double getYardAcres() {
        return this.yardAcres;
    }

    //Setter
    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }
}
