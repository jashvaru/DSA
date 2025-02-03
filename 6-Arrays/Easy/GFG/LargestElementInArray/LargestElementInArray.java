public class LargestElementInArray {

    public static int largestElement(int[] arr) {
        int largest = 0;

        for (int i : arr) {
            if(i > largest) {
                largest = i;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int largest = largestElement(arr);
        System.out.println("largest: " + largest);
    }
    
}

/* 
 * Time Complexity
 * O(n) - since we need to check each element of the array it will be same as size of the array
 * 
 * Space Complexity
 * O(1) - As we are using constant number of variable irrespective of array size
 * 
 */

//Time taken 2 mins
