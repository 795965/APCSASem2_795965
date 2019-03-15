
/**
 * Write a description of class InsertSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertSorter extends Sorter
{
   public void sort(int [] nums) {
       
        for (int i = 1; i < nums.length; i++){
            for (int j = i; j > 0; j--){
                if (less(j, j-1)) { // if the current value is less, swap
                    swap(nums, i , j);
                }
            }
        }

        for (int k = 0; k< nums.length; k++){ // loop to print all values of sorted array
            System.out.println(nums[k]); 
        }
    }
}
