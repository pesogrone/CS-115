package BlackJackTest;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;

import BlackJack.BJCard;
import BlackJack.BJDeck;
import BlackJackBase.PCard;
import BlackJackBase.PDeck;
import BlackJack.BJHand;
import BlackJackBase.PGame;

public class PlayBlackJack {

	public static void main(String[] args) {
		
		PGame.setBackgroundColor(Color.decode("#1b7c4d"));
		PGame.setBannerColor(Color.decode("#0a3823"));
		PGame.setBannerTextColor(Color.decode("#fdfefe"));
		PGame.setButtonColor(Color.CYAN);
		PGame.setButtonHighlightColor(Color.ORANGE);
		PGame.setStatusTextColor(Color.yellow);
		PGame.setButtonTextColor(Color.RED);
		PGame.setFont(Font.SERIF);
		
		 // BJCard c1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		//	CardTest.run(c1);
			BJDeck c1 = new BJDeck();
		//DeckTest.run(c1);   
		//BJHand hand = new BJHand();
	//	BJHand player = new BJHand();
			//HandTest.run(c1, new BJHand());
         DeckTest.run(c1);
	     // PGame.run(c1, hand, player);


	}

	}
	
   
	


