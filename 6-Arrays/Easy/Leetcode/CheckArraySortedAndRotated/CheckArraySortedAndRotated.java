public class CheckArraySortedAndRotated {

    public static boolean checkArraySortedAndRotated(int[] arr) {
        int size = arr.length;
        boolean isArraySorted = false;
        for(int i = 0; i < size; i++) {
            isArraySorted = checkIfArraySorted(arr);
            if(isArraySorted) {
                return isArraySorted;
            } else {
                
            }
        }

        return false;
    }

    public static boolean checkIfArraySorted(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        checkArraySortedAndRotated(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    
}

/* 
 * Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2].
 */
