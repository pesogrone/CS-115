/*CS 115 - Brother Light
 * Ronald M. Britos
 * 10/15/2022
 * Real state
 * */
package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testGetFloorLvl() {
		Condo p1 = new Condo("hello", 5, 9, 8, 4, 3 );
		assertEquals(p1.getFloorLvl(), 3);
	}

	@Test
	void testSetFloorLvl() {
		Condo p1 = new Condo("hello", 5, 9, 8, 4, 3 );
		p1.setFloorLvl(4);
		assertEquals(p1.getFloorLvl(), 4);
	}
	@Test
	void testCalculateApraisalPrice() {
		Condo p1 = new Condo("hello", 5, 9, 8, 4, 3 );
			p1.calculateApraisalPrice();
		assertEquals(p1.calculateApraisalPrice(),33088.0);
	}

}
