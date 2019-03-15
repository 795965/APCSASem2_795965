
/**
 * Write a description of class MergeSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSorter extends Sorter
{
    public void sort(int [] nums){
        int n = nums.length;
        if (less(n,2)) { //  Base Case
            return ;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = nums[i];
        }
        sort(l);
        sort(r);
        //+++++++++ Helper Function ++++++++++++
        merge(nums, l, r, mid, n - mid);
    }
    public void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (less(i, left) && less(j, right)) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (less(i, left)) {
            a[k++] = l[i++];
        }
        while (less(j, right)) {
            a[k++] = r[j++];
        }

        for (int x =0; x< a.length; x ++){
            System.out.println(a[x]);
        }
    } 
}
