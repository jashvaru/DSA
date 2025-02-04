public class SecondLargestElementInArray {
    
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
    
    public static int getSecondLargest(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        int secondLargest = 0;
        for(int i = arr.length-2; i >= 0; i--) {
            if(arr[i] != arr[arr.length-1]) {
                secondLargest = arr[i];
                break;
            } else {
                secondLargest = -1;
            }
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int secondLargest = getSecondLargest(arr);
        System.out.println("secondLargest: " + secondLargest);
    }
}

/* 
 * Brute Force
 * -Sort the array using any sorting technique here I am using Quick Sort.
 * -Ideally the second last element in an array would be second largest if all elements are distinct
 * and array is sorted in ascending order.
 * -But there can be possibility that the largest element have multiple values than above step is incorrect.
 * -To solve it we start comparing largest element of the array to each element of the array
 * from end[arr.length-2] to front
 * -If we found a value not equal to largest than that will be second largest in sorted array.
 * -If all elements in an array is largest than return -1
 * 
 * Time Complexity
 * O(nlogn) + N = (sorting algo + to find second largest)
 * 
 * Space Complexity
 * O(n) or O(logn) if we consider stack space
 * 
 * 
 */
