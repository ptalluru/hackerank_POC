/**
 * 
 * Exercise: Write a small program to test your deck and card classes. The
 * program can be as simple as creating a deck of cards and displaying its
 * cards.
 *
 */
public class DisplayDeck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
			for (int rank = Card.ACE; rank <= Card.KING; rank++) {
				Card card = deck.getCard(suit, rank);
				System.out.format("%s of %s%n", card.rankToString(card.getRank()), 
						card.suitToString(card.getSuit()));
			}
		}
	}
}