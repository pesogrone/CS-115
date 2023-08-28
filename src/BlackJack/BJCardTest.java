package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BJCardTest {


	@Test
	void testGetSuit() {
		BJCard c1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		assertEquals(c1.getSuit(), 1);
	}

	@Test
	void testSetSuit() {
		BJCard c1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		c1.setSuit(BJCard.TWO);
		assertEquals(c1.getSuit(), 2);
	}

	@Test
	void testGetRank() {
		BJCard c1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		assertEquals(c1.getRank(),1);
	}

	@Test
	void testSetRank() {
		BJCard c1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		c1.setRank(13);
		assertEquals(c1.getRank(), BJCard.QUEEN);
	}

}