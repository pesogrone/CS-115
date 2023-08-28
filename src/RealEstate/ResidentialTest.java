/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */
package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testGetBeds() {
		Condo p1 = new Condo("943 east 400 south",84102 , 0, 0, 0, 0);
		assertEquals(p1.getBeds(), 0);
	}

	@Test
	void testGetBaths() {
		Condo p1 = new Condo("943 east 400 south",84102 , 0, 0, 0, 0);
		assertEquals(p1.getBaths(), 0);
	}

	@Test
	void testGetSize() {
		Condo p1 = new Condo("943 east 400 south",84102 , 0, 0, 0, 0);
		assertEquals(p1.getSize(), 0);
	}

	@Test
	void testSetBeds() {
		Condo p1 = new Condo("943 east 400 south",84102 , 0, 0, 0, 0);
		p1.setBeds(3);
		assertEquals(p1.getBeds(), 3);
	}

	@Test
	void testSetBaths() {
		Condo p1 = new Condo("943 east 400 south",84102 , 0, 0, 0, 0);
		p1.setBaths(2);
		assertEquals(p1.getBaths(), 2);
	}

	@Test
	void testSetSize() {
		Condo p1 = new Condo("943 east 400 south",84102 , 0, 0, 0, 0);
		p1.setSize(1005.8);
		assertEquals(p1.getSize(), 1005.8);
	}

}
