/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test = new Card("King", "Spades", 10);
		System.out.println(test.matches(test));
		System.out.println(test);
		
	}
}
