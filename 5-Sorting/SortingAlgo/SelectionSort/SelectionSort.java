public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 2, 6, 1 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Logic
 * -Initialize - start with the first element in the array as the initial sorted
 * part.
 * -Find Minimum - scan the unsorted portion of the array to find he smallest
 * element. Identify its index.
 * -Swap - swap the smallest element with the first element of the unsorted
 * portion.
 * -Repeat - move the boundary of the sorted portion one step forward and repeat
 * the process untl entire
 * array is sorted
 * 
 * Time Complexity
 * The outer loop will run from 0 to N and for each outter loop the inner loop
 * will run from 1 to N-1. we can say that loops summation of N natural numbers
 * hence n(n-1)/2 approx O(n^2)
 * O(n^2)
 * 
 * Space Complexity
 * Since we are using constant number of variables
 * O(1)
 */
