package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand {
	// Attributes
	private ArrayList<BJCard> hands;

	// Constructors
	public BJHand() {
		hands = new ArrayList<BJCard>();
	}

	@Override
	public int getSize() {
		return hands.size();

	}

	@Override
	public void addCard(PCard card) {
		hands.add((BJCard) card);

	}

	@Override
	public PCard getCard(int index) {
		return hands.get(index);
	}

	@Override
	public PCard removeCard(int index) {
		return hands.remove(index);
	}

	@Override
	public int getValue() {
		int Aces = 0;
		int Score = 0;
		for (BJCard card : hands) {
			if (card.getRank() == 1) {
				Aces++;
			} else if (card.getRank() >= 2 && card.getRank() <= 9) {
				Score += card.getRank();
			} else if (card.getRank() >= 10 && card.getRank() <= 14) {

				Score += 10;
			}

		}
		for (int i = 0; i < Aces; i++) {
			if (Score + 11 <= 21) {

				Score += 11;
			} else {

				Score += 1;
			}
		}
		return Score;
	}
}
