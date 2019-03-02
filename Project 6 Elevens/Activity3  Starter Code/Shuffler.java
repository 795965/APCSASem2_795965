/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

      /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 5;

    /**
     * The number of values left to shuffle.
     */
    private static final int VALUE_COUNT = 10;

    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        //given as starter code
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT]; //added to create random array instead of {1,2,3,4}
        for (int i = 0; i < values1.length; i++) {
            values1[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.printf(" %2d", values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) {
            values2[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.printf(" %2d", values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
        //splits array into 2 halves
        int[] firstHalf = new int[ VALUE_COUNT / 2 ];
        int[] secondHalf = new int[ VALUE_COUNT - VALUE_COUNT / 2 ];
        //sets first half to value in the array
        for( int i = 0; i < VALUE_COUNT / 2; i++ ) {
            firstHalf[i] = values[i];
        }
        //makes the second half the second half of the given array
        for( int i = 0; i < VALUE_COUNT - VALUE_COUNT / 2; i++ ) {
            secondHalf[i] = values[ i + VALUE_COUNT / 2 ];
        }
        //swaps the value in the first with the second array
        for( int i = 0; i < VALUE_COUNT / 2; i++ ) {
            values[ 2 * i ] = secondHalf[i];
            values[ 2 * i + 1 ] = firstHalf[i];
        }
        //puts the even values of the array into the odd values of the shuffled array
        if( VALUE_COUNT % 2 != 0 ) {
            values[ VALUE_COUNT - 1 ] = secondHalf[ VALUE_COUNT - VALUE_COUNT / 2 ];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
        //makes pefect shuffle but without picking the value that hasn't been used randomly
        
        for( int k = VALUE_COUNT - 1; k >= 0; k-- ) {
            int r = (int)(Math.random() * k);
            //swap routine
            int temp = values[r];
            values[r] = values[k];
            values[k] = temp;
        }
    }
}

