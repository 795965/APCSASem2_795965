
/**
 * Lab 109 
 * Sorting Algorithms all arrays - MySort, Bubble, Select, Insert
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sort
{
    public static void mySort(){
        int small = 0; //int to find the smallest unsorted values
        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1}; //unsorted array
        int order[] = new int [nums.length]; // new  sorted array
        int i  = 0; 
        while(i< nums.length){ //keeps track of length of sorted array
            for (int x = 0; x<nums.length; x++){ //traverses nums

                if (nums[x] == small){ // if the value = small
                    order[i] =small; //assign that value to order
                    i++; //increment to keep track of length of sorted array
                }

            }
            small ++; // increment small - looking for next biggest int
        }
        for (int j = 0; j< order.length; j++){ // loop to print all values of sorted array
            System.out.println(order[j]); 
        }
    }

    public static void bubbleSort(){
        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1}; //unsorted array
        int temp;
        for (int j=nums.length-1; j >0; j--){
            for (int i = 0; i< j; i++){
                if (nums[i] > nums[i+1]) { 
                    temp = nums [i];
                    nums [i] = nums [i+1]; 
                    nums [i+1] = temp; 
                }
            }
            for (int x = 0; x< nums.length; x++){ // loop to print all values of sorted array
                System.out.print(nums[x]); 
            }
            System.out.print("\n");
        }
        // for (int x = 0; x< nums.length; x++){ // loop to print all values of sorted array
        // System.out.print(nums[x]); 
        // }
        //System.out.print("\n");
    }

    public static void selectSort(){

        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1}; //unsorted array
        int temp; 
        for (int i  = 0; i < nums.length -1; i++){ //keeps track of length of sorted array
            int small = i; //int to find the smallest unsorted values
            for (int j = i+1; j <nums.length; j++){ //traverses nums

                if (nums[j] < nums[small]){ // if the value = small
                    small =j; 
                }

            }
            temp = nums [small];
            nums [small] = nums [i]; 
            nums [i] = temp; 
        }
        for (int k = 0; k< nums.length; k++){ // loop to print all values of sorted array
            System.out.println(nums[k]); 
        }
    }

}
