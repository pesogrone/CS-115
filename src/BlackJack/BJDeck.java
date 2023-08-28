package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackTest.DeckTest;

public class BJDeck implements BlackJackBase.PDeck {
	// Attributes

	private ArrayList<BJCard> cards;

	// Constructors
	public BJDeck() {
		cards = new ArrayList<BJCard>();
		for (int i = 1; i < 15; i++) {
			for (int t = 1; t < 5; t++) {
				cards.add(new BJCard(i, t));
			}

		}
	}

	@Override
	public void shuffle() {
		Collections.shuffle(cards);

	}

	@Override
	public void addCard(PCard card) {
		cards.add((BJCard) card);

	}

	@Override
	public PCard dealCard() {
		if (cards.isEmpty()) {
			return null;
		} else {

			return cards.remove(cards.size() - 1);
		}

	}

	@Override
	public PCard dealHiddenCard() {
		if (cards.size()==0) {
			return null;
		} else {
			BJCard card = cards.remove(cards.size() - 1);
			card.setHidden(true);
			return card;
		}

	}

	@Override
	public int cardCount() {

		return cards.size();
	}

}
