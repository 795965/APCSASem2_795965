
/**
 * Abstract class SelectionSorter - write a description of the class here
 *
 * @author (Ziggy Sheynin)
 * @version (Activities Sorting 3/13/19)
 */
public abstract class SelectionSorter extends Sorter
{
   public static void Sort(){

        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1}; //unsorted array
        int temp; 
        int swap = 0; 
        int compare =0; 
        double time = System.nanoTime();
        for (int i  = 0; i < nums.length -1; i++){ //keeps track of length of sorted array
            int small = i; //int to find the smallest unsorted values
            for (int j = i+1; j <nums.length; j++){ //traverses nums

                if (nums[j] < nums[small]){ // if the value = small
                    small =j; 

                }
                compare++;

            }
            temp = nums [small];
            nums [small] = nums [i]; 
            nums [i] = temp; 
            swap++;
        }
        double timeEnd = System.nanoTime();
        for (int k = 0; k< nums.length; k++){ // loop to print all values of sorted array
            System.out.println(nums[k]); 
        }
        System.out.println("swap:" + swap); 
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 
    }
}
