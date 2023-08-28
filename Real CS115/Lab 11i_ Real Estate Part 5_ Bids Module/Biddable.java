/*Program/Project: Lab11i
 *Name: Alex Alonso
 *Date: 03/26/2022
 *Instructor: Brother Light
 *Description: Lab 11i: Real Estate Part 5: Bids Module
 */

package RealEstate;

import java.util.HashMap;
import java.util.Set;

public interface Biddable {

    //getBids meth -HashMap-
    HashMap<String, Double> getBids();

    //getBid meth
    Double getBid(String s);

    //getBidders meth
    Set<String> getBidders();

    //getBidCount meth
    int getBidCount();

    //newBid meth
    void newBid(String s, Double d);

}//class end.



