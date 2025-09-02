import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {
        
        if(low == high) {
            return;
        } 

        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> resList = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                resList.add(arr[left]);
                left++;
            } else {
                resList.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            resList.add(arr[left]);
                left++;
        }

        while (right <= high) {
            resList.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            arr[i] = resList.get(i-low);
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        // int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Logic
 * ->Divide(Splitting the array)
 *  -The input array is recursively divided into two halves until each subarray contains only one element.
 *  -This process continues until we reach the smallest possible subarrays.
 * ->Conquer(Sorting the subarray)
 *  -Now that we have many small sorted subarrays we begin merging them back together.
 *  -While merging we compare elements from two subarrays and arrange them in sorted order.
 * ->Merge(Combining Sorted Subarrays)
 *  -We repeatedly merge smaller sorted subarrays to form larger sorted subarrays
 *  -This merging process continues until all the subarrays are merged back into one fully sorted subarray.
 * 
 * Time Complexity
 * Each level of recursion splits the array into two halves, 
 * leading to a recursion depth of log₂(n). Each level performs O(n) operations for merging.
 * 
 * hence O(n log2(n))
 * Worst case - O(n log2(n))
 * Avg case - O(n log2(n))
 * Best case - O(n log2(n))
 * 
 * Space Complexity
 * Since we are using temp list of same size as array 
 * O(n)
 */
