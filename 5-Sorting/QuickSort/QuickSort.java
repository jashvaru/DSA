public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int partition = partition(arr, low, high);
        quickSort(arr, low, partition - 1);
        quickSort(arr, partition + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if(i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }


    public static void main(String[] args) {
        // int[] arr = {4, 1, 3, 9, 7};
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Logic
 * ->Divide (Partitioning)
 *  -Select a 'pivot' element from the array. The choice of pivot can vary; common strategies 
 *  include picking the first element, the last element, the middle element, or a random element.
 *  -Rearrange the array so that elements less than the pivot are positioned to its left, and 
 *  elements greater than the pivot are positioned to its right. This step is known as partitioning.    
 * ->Conquer (Recursive Sorting)  
 *  -Recursively apply the same process to the sub-arrays formed by partitioning:
 *      -Sort the sub-array of elements less than the pivot.
 *      -Sort the sub-array of elements greater than the pivot.
 * ->Combine
 *  -Since the partitioning step ensures that the pivot is already in its correct position, 
 *  no further work is needed to combine the sub-arrays. The array is sorted once all sub-arrays 
 *  have been processed.
 * 
 * Time Complexity
 * Each level of recursion splits the array into two halves, 
 * leading to a recursion depth of log₂(n). Each level performs O(n) operations to sort.
 * 
 * hence O(n log2(n))
 * Worst case - O(n log2(n))
 * Avg case - O(n log2(n))
 * Best case - O(n log2(n))
 * 
 * Space Complexity
 * Since we are not using extra variable 
 * O(1)
 * If we consider stack space for recursion
 * O(n)
 */
