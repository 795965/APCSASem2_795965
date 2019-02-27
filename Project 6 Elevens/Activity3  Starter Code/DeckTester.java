/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
            /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            String[] rank1 = {"King", "Queen", "Jack"};
            String[] suit1 = {"Spade", "Heart", "Diamond"};
            int[] values1 = {13, 12, 11};
            Deck deck1 = new Deck(rank1, suit1, values1);
            System.out.println(deck1.size());
            
            String[] rank2 = {"10", "9", "8"};
            String[] suit2 = {"Spade", "Heart", "Diamond"};
            int[] values2 = {10, 9, 8};
            Deck deck2 = new Deck(rank2, suit2, values2);
            System.out.println(deck2.size());
            
            String[] rank3 = {"7", "6", "5"};
            String[] suit3 = {"Spade", "Heart", "Diamond"};
            int[] values3 = {7, 6, 5};
            Deck deck3 = new Deck(rank3, suit3, values3);
            System.out.println(deck3.size());
            
    }
}
