/*Program/Project: Lab4i
 *Name: Alex Alonso
 *Date: 02/05/2022
 *Instructor: Brother Light
 *Description: Lab 4i: Real Estate Office Part 1: Class Structure
 */

package RealEstate;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyTest {

    @Test
    public void getstreetAddress() {
        Property p1 =new Property("123 North Temple","84101");
        assertEquals("123 North Temple",p1.getstreetAddress());

    }

    @Test
    public void getZip() {
        Property p1 =new Property("123 North Temple","84101");
        assertEquals("84101",p1.getZip());
    }

    @Test
    public void setstreetAddress() {
        Property p1 =new Property("123 North Temple","84101");
        p1.setstreetAddress("345 North Temple ");
        assertEquals("345 North Temple ",p1.getstreetAddress());
    }

    @Test
    public void setZip() {
        Property p1 =new Property("123 North Temple","84101");
        p1.setZip("84105");
        assertEquals("84105",p1.getZip());
    }
}