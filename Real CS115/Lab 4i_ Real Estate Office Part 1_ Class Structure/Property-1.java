/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

public class Property {
    String streetAddress;
    String zip;

    //Const
    public Property(){
        streetAddress = "";
        zip = "";
    }

    //Const
    public Property(String streetAddress, String zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    //getters
    public String getstreetAddress() {
         return streetAddress;
    }

    public String getZip() {
        return zip;
    }

    //setters
    public void setstreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
