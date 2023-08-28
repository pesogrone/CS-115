/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    @Test
    public void getYardAcres() {
        House p1 =new House("123 North Temple","84101",2,2.5,2000,1);
        assertEquals(1,p1.getYardAcres(),1e-15);
    }

    @Test
    public void setYardAcres() {
        House p1 =new House("123 North Temple","84101",2,2.5,2000,1);
        p1.setYardAcres(2.5);
        assertEquals(2.5 ,p1.getYardAcres(),1e-15);
    }
}