
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Logic
 * -Starting from first element, compare each pair of adjacent elements
 * -If the first element is greater than the second swap them. 
 * -Move to the next pair and repeat the process until the last element of the list.
 * -After each iteration the largest element "bubbles up" to its correct position at the end of the array
 * -Repeat the process for the remaining unsorted elements until the list is fully sorted.
 * 
 * Time Complexity
 * The outer loop will run from 0 to N-1 and for each outter loop the inner loop
 * will run from 1 to N-i-1. we can say that loops summation of N natural numbers
 * hence n(n-1)/2 approx O(n^2)
 * O(n^2)
 * 
 * Space Complexity
 * Since we are using constant number of variables
 * O(1)
 */