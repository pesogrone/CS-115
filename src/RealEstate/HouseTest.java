/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */
package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testGetYardAcres() {
		House p1 = new House("943 east 400 south",84102, 2,2, 1, 1);
		assertEquals(p1.getYardAcres(), 1);
	}

	@Test
	void testSetYardAcres() {
		House p1 = new House("943 east 400 south",84102, 2,2, 1, 1);
		p1.setYardAcres(505.6);
		assertEquals(p1.getYardAcres(), 505.6);
	}
	@Test
	void testCalculateapraisalPrice() {
		House p1 = new House("943 east 400 south",84102, 2,2, 1, 1);
		p1.calculateApraisalPrice();
		assertEquals(p1.calculateApraisalPrice(), 482097);
	}
}
