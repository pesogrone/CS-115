/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

import org.junit.Test;

import static org.junit.Assert.*;

public class CondoTest {

    @Test
    public void getFloorLvl() {
        Condo c1 = new Condo("123 North Temple","84101",2,2.5,250.5,3);
        assertEquals(3,c1.getFloorLvl());
    }

    @Test
    public void setFloorLvl() {
        Condo c1 = new Condo("123 North Temple","84101",2,2.5,250.5,3);
        c1.setFloorLvl(17);
        assertEquals(17,c1.getFloorLvl());
    }
}