
/**
 * Write a description of class BubbleSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSorter extends Sorter
{
    public void sort(int [] nums){
        
        for (int j=nums.length-1; j >0; j--){
            for (int i = 0; i< j; i++){
                if (less(i, i+1)) { 
                    swap(nums, i , j); 
                }
            }

        }

        for (int x = 0; x< nums.length; x++){ // loop to print all values of sorted array
            System.out.print(nums[x]); 
        }
    }
}
