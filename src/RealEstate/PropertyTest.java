/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */
package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {

	@Test
	void testGetStreetAddress() {
		Condo p1 = new Condo("943 east 400 south",84102 , 1, 1, 1.0, 1 );
		assertEquals(p1.getStreetAddress(), "943 east 400 south");
	}

	@Test
	void testGetZip() {
		Condo p1 = new Condo("943 east 400 south",84102 , 1 , 1, 1.0, 0);
		assertEquals(p1.getZip(), 84102);
	}

	@Test
	void testSetStreetAddress() {
		Condo p1 = new Condo("943 east 400 south",84102 , 1 , 1, 1.0, 0);
		p1.setStreetAddress("455 s 700 E");
		assertEquals(p1.getStreetAddress(), "455 s 700 E");
	}

	@Test
	void testSetZip() {
		Condo p1 = new Condo("943 east 400 south",84102 , 1 , 1, 1.0, 0);
		p1.setZip(84097);
		assertEquals(p1.getZip(), 84097);
	}
	@Test 
	void testGetlistPrice() {
		Condo p1 = new Condo("943 east 400 south",84102 , 1 , 1, 1.0, 0);
		assertEquals(p1.getZip(), 84102.0);
	}
	@Test
    void testGeapraisalPrice() {
		Condo p1 = new Condo("943 east 400 south",84102 , 1 , 1, 1.0, 0);
		assertEquals(p1.getZip(), 84102.0);
	}

}
