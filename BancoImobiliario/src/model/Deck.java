package model;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> deck = new ArrayList<Card>(29);
	
	public Card withdrawCard() {
		Random random = new Random();
		int value = random.nextInt(29);
		deck.remove(value);
		return deck.get(value);
	}
}
