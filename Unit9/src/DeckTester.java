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
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits =  {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck test = new Deck(ranks, suits, pointValues);
		/*test.shuffle();*/
		int i = 0;
		while (i < suits.length * ranks.length)
		{
			System.out.println(test.deal());
			i++;
		}
		
		
	}
}
