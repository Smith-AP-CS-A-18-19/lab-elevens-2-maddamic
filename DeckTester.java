/**
 * This is a class that tests the Deck class.
 */
 public class DeckTester {

 	/**
 	 * The main method in this class checks the Deck operations for consistency.
 	 *	@param args is not used.
 	 */
 	public static void main(String[] args) {
 		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

 		String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
 		String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};
 		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
 		int[] number = new int[52];
 		Deck deck1 = new Deck(rank, suit, value);
 		System.out.println(deck1.size());
 		System.out.println(deck1.deal());

 	}
}
