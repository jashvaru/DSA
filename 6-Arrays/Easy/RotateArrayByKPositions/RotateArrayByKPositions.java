public class RotateArrayByKPositions {

    public static void rotateArrayByKPositions(int[] arr, int k) {
        int len = arr.length;
        k = k % len;
        int[] temp = new int[k];

        //Copy value into temp array
        for(int i = 0; i < k; i++) {
            temp[i] = arr[len - k + i];
        }
        //move remaining elements to right
        for(int i = 0; i < len-k; i++) {
            arr[len-1-i] = arr[len-k-1-i];
        }
        //copy value from temp array to main array
        for(int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArrayByKPositions(arr, k);
    }

}

/*
* Logic
* This is better solution
* -If k is same as size of array than we need to rotate array by k % length times
* -As we need to rotate array towards right we will take last k elements and copy it to temp array
* -Shift remaining elements of the array towards right
* -Copy the temp array to the remaining places of the array at the start of the array
*
* Time Complexity
* It takes
* O(k) - copy array to temp
* +
* O(n-k) - right shift elements
* +
* O(k) - copy temp to array
*
*time complexity will be O(n+k)
*
* Space Complexity
* O(k) - as we are using k size temp array
*
* */



