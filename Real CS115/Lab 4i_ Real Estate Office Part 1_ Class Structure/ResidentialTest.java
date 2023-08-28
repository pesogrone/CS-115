/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResidentialTest {

    @Test
    public void getBeds() {
        Residential p1 =new Residential("123 North Temple","84101",3,2.5,1200);
        assertEquals(3,p1.getBeds());
    }

    @Test
    public void getBaths() {
        Residential p1 =new Residential("123 North Temple","84101",3,2.5,1200);
        assertEquals(2.5,p1.getBaths(),1e-15);
    }

    @Test
    public void getSize() {
        Residential p1 =new Residential("123 North Temple","84101",3,2.5,1200);
        assertEquals(1200,p1.getSize(),1e-15);
    }

    @Test
    public void setBeds() {
        Residential p1 =new Residential("123 North Temple","84101",3,2.5,1200);
        p1.setBeds(4);
        assertEquals(4,p1.getBeds());
    }

    @Test
    public void setBaths() {
        Residential p1 =new Residential("123 North Temple","84101",3,2.5,1200);
        p1.setBaths(3.5);
        assertEquals(3.5,p1.getBaths(),1e-15);
    }

    @Test
    public void setSize() {
        Residential p1 =new Residential("123 North Temple","84101",3,2.5,1200);
        p1.setSize(1500);
        assertEquals(1500,p1.getSize(),1e-15);
    }
}