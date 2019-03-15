
/**
 * Abstract class SelectionSorter - write a description of the class here
 *
 * @author (Ziggy Sheynin)
 * @version (Activities Sorting 3/13/19)
 */
public class SelectionSorter extends Sorter
{
    public void sort(int [] a){

        for (int i  = 0; i <a.length -1; i++){ //keeps track of length of sorted array
            int small = i; //int to find the smallest unsorted values
            for (int j = i+1; j <a.length; j++){ //traverses nums

                if (less(j, small)){ // if the value = small
                    small = j;
                }

            }

            swap(a, i ,small);
        }
        for (int k = 0; k< a.length; k++){ // loop to print all values of sorted array
            System.out.println(a[k]); 
        }

    }
}
