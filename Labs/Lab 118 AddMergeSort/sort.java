
/**
 * Lab 118 sorting algorithms array notation with Merge Sort
 *
 *Ziggy Sheynin
 *Lab 118
 */
import java.util.ArrayList; 
public class sort
{
    public static void mySort(){
        int small = 0; //int to find the smallest unsorted values
        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1}; //unsorted array
        int order[] = new int [nums.length]; // new  sorted array
        int i  = 0; 
        int swap = 0; 
        int compare =0; 
        double time = System.nanoTime();
        while(i< nums.length){ //keeps track of length of sorted array
            for (int x = 0; x<nums.length; x++){ //traverses nums

                if (nums[x] == small){ // if the value = small
                    order[i] =small; //assign that value to order
                    i++; //increment to keep track of length of sorted array
                    swap++;
                }
                compare++;
            }
            small ++; // increment small - looking for next biggest int
        }
        double timeEnd = System.nanoTime();
        for (int j = 0; j< order.length; j++){ // loop to print all values of sorted array
            System.out.println(order[j]); 
        }
        System.out.println("swap:" + swap); 
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 
    }

    public static void bubbleSort(){
        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1}; //unsorted array
        int temp;
        int swap = 0; 
        int compare =0; 
        double time = System.nanoTime();
        for (int j=nums.length-1; j >0; j--){
            for (int i = 0; i< j; i++){
                if (nums[i] > nums[i+1]) { 
                    temp = nums [i];
                    nums [i] = nums [i+1]; 
                    nums [i+1] = temp; 
                    swap ++; 
                }
                compare++;

            }

        }
        double timeEnd = System.nanoTime();
        for (int x = 0; x< nums.length; x++){ // loop to print all values of sorted array
            System.out.print(nums[x]); 
        }
        System.out.print("\n");
        System.out.println("swap:" + swap); 
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 
    }

    public static void selectSort(){

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

    public static void insertSort() {
        int nums[] = new int[]{3, 6, 2, 5, 7, 1, 0, 8, 5, 1}; //unsorted array
        int temp;
        int swap = 0; 
        int compare =0;
        double time = System.nanoTime();
        for (int i = 1; i < nums.length; i++){
            for (int j = i; j > 0; j--){
                if (nums[j] < nums[j-1]) { // if the current value is less, swap
                    temp = nums [j];
                    nums [j] = nums [j-1]; 
                    nums [j-1] = temp; 
                    swap++;
                }
                compare++;
            }
        }
        double timeEnd = System.nanoTime();
        for (int k = 0; k< nums.length; k++){ // loop to print all values of sorted array
            System.out.println(nums[k]); 
        }
        System.out.println("swap:" + swap); 
        System.out.println("compare:" + compare); 
        System.out.print( "Time:" + (timeEnd- time)); 
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) { //  Base Case
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
    }

    
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        for (int x =0; x< a.length; x ++){
            System.out.println(a[x]);
        }
    } 
}
