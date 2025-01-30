public class InertionSort {

    public static void inserstionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while(j > 0 && (arr[j] < arr[j-1])) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        // int[] arr = {4, 1, 3, 9, 7};
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        inserstionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Logic
 * -Start with the second element(index 1) and compare it with the first element(index 0)
 * -If the second element is smaller, shift the first element to the right and insert the second element
 * in its correct position
 * -Move to the next element(index 2) and insert it into its correct position among the first two elements
 * -Repeat the process for the rest of the elements until the entire list is sorted
 * 
 * Time Complexity
 * The outer loop will run from 0 to N-1 and for each outter loop the inner loop
 * will run from 1 to N-i-1. we can say that loops summation of N natural numbers
 * hence n(n-1)/2 approx O(n^2)
 * Worst case - O(n^2)
 * Avg case - O(n^2)
 * Best case - O(n)
 * 
 * Space Complexity
 * Since we are using constant number of variables
 * O(1)
 */
