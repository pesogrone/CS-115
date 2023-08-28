/*
 * Program: Lab3a - Dessert Shop, Part 1—Class Structure
 * Names: Porter Sykes & Mijhail Britos
 * Date: 09/27/2022
 * Instructor: Brother Light
 * Description: Dessert Shop superclass and subclass
 */
package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testGetCandyWeight() {
		Candy cy = new Candy("Lucas",10.0, 20.0);
		assertEquals(cy.getCandyWeight(), 10.0);
	}

	@Test
	void testSetCandyWeight() {
		Candy cy = new Candy("Lucas",10.0, 20.0);
		cy.setCandyWeight(8.0);
		assertEquals(cy.getCandyWeight(), 8.0);
	}

	@Test
	void testGetPricePerPound() {
		Candy cy2 = new Candy("Lucas",10.0, 20.0);
		assertEquals(cy2.getPricePerPound(),20.0);
	}

	@Test
	void testSetPricePerPound() {
		Candy cy2 = new Candy("Lucas",10.0, 20.0);
		cy2.setPricePerPound(30.0);
		assertEquals(cy2.getPricePerPound(), 30.0);
	}
	@Test
	void testcalculateCost() {
		Candy cy2 = new Candy("Lucas",.25, .35);
		assertEquals(cy2.calculateCost(),0.0875);
	}
	@Test
	void testcalculateTax() {
		Candy cy2 = new Candy("Lucas",.25, .35);
		assertEquals(cy2.calculateTax(),0.0063437499999999996);
	}
	@Test
	void testisSameAs(){
		Candy cy2 = new Candy("Lucas",.25,.35);
		Candy cy3 = new Candy("Lucas",.26,.35);
		Candy cy4 = new Candy("Lucas",.25,.34);
		assertEquals(cy2.isSameAs(cy3), true);
		assertEquals(cy2.isSameAs(cy4), false);
	}

}
