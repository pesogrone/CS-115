/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

public class Condo extends Residential {
    int floorLvl;

    //Const
    public Condo(){
        super();
        floorLvl = 0;
    }//end

    //Const
    public Condo(String streetAddress, String zip, int bedCount,double bathCount, double sqFootage,int floorLvl){
        super(streetAddress,zip,bedCount,bathCount,sqFootage);
        this.floorLvl = floorLvl;
    }//end

    //Getter
    public int getFloorLvl() {
        return this.floorLvl;
    }

    //Setter
    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }
}
