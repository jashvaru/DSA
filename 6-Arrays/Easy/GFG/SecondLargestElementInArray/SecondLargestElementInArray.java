/* public class SecondLargestElementInArray {
    
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
} */

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

/*  public class SecondLargestElementInArray {
    
    public static int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int secondLargest = getSecondLargest(arr);
        System.out.println("secondLargest: " + secondLargest);
    }
} */

/* 
 * Better Approach
 * -Run a loop to find the largest element in the array.
 * -Run another loop to find the 2nd largest element which will be less than the largest and not 
 * equal to largest
 * 
 * Time Complexity
 * O(n) + O(n) = O(2n) 
 * 
 * Space Complexity
 * O(1)
 */

 public class SecondLargestElementInArray {
    
    public static int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 9, 7};
        int secondLargest = getSecondLargest(arr);
        System.out.println("secondLargest: " + secondLargest);
    }
}

/* 
 * Optimal Approach
 * -Initially keep largest as first element of the array and second largest as -1
 * -Run a loop and if you find an element value greater than the largest tha 
 * assign largest to second largest and element value to largest
 * -If the next element is not greater than largest than check if the element is greater than 
 * second largest and not equal to largest if this satisfies than assign the element to second largest
 * 
 * Time Complexity
 * O(n) 
 * 
 * Space Complexity
 * O(1)
 */