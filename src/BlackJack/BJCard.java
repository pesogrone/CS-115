package BlackJack;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import BlackJackBase.PCard;

public class BJCard extends PCard {
	// Attributes
	private int rank;
	private int suit;
	private Boolean hidden;
	// Constants
	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int KNIGHT = 12;
	public static final int QUEEN = 13;
	public static final int KING = 14;

	public static final int SPADE = 1;
	public static final int HEART = 2;
	public static final int DIAMOND = 3;
	public static final int CLUB = 4;
	// Constructor

	public BJCard(int r, int s) {
		rank = r;
		suit = s;
		hidden = false;

	
		
			
		} 
			
	

	// Methods

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	public boolean getHidden() {
		return hidden;
	}

	public void setRank(int r) {
		rank = r;
	}

	public void setSuit(int s) {
		suit = s;
	}

	public void setHidden(boolean h) {
		hidden = h;

	}

	@Override
	public Color getFontColor() {
		if (suit == DIAMOND || suit == HEART) {
			return Color.RED;
		} else {
			return Color.BLACK;
		}
	}

	@Override
	public Color getFaceColor() {
		return Color.WHITE;
	}
	@Override
	public Color getBorderColor() {
		
	return Color.black;
	}
	



	@Override
	public Color getStripeColor() {
		return Color.decode("#195fbd");
	}	
	
	@Override
	public Color getBackColor() {
		return Color.decode("#32bdff");
	}
	

	@Override
	public void hideCard() {
		hidden = true;

	}

	@Override
	public void showCard() {
		hidden = false;

	}

	@Override
	public boolean isHidden() {
		return hidden;
	}

	@Override
	public String getText() {

		String lSuit = "";
		String lRank = "";

		switch (suit) {
		case 1:
			lSuit = "\u2660";
			break;
		case 2:
			lSuit = "\u2665";
			break;
		case 3:
			lSuit = "\u2666";
			break;
		case 4:
			lSuit = "\u2663";
			break;
		}// end of switch lSuit

		switch (rank) {
		case 1:
			lRank = "A";
			break;
		case 2:
			lRank = "2";
			break;
		case 3:
			lRank = "3";
			break;
		case 4:
			lRank = "4";
			break;
		case 5:
			lRank = "5";
			break;
		case 6:
			lRank = "6";
			break;
		case 7:
			lRank = "7";
			break;
		case 8:
			lRank = "8";
			break;
		case 9:
			lRank = "9";
			break;
		case 10:
			lRank = "10";
			break;
		case 11:
			lRank = "J";
			break;
		case 12:
			lRank = "KN";
			break;
		case 13:
			lRank = "Q";
			break;
		case 14:
			lRank = "K";
			break;
		}

		return lRank + lSuit;

	}
}
