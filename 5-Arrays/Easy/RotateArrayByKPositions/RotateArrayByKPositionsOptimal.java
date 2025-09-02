public class RotateArrayByKPositionsOptimal {

    public static void reverse(int start, int end, int[] arr) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArrayByKPositions(int[] arr, int k) {
        int len = arr.length;
        k = k % len;
        reverse(0, len-k-1, arr);
        reverse(len-k, len-1, arr);
        reverse(0, len-1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArrayByKPositions(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}

/*
 * Logic
 * This is Optimal solution
 * -If k is same as size of array than we need to rotate array by k % length times
 * -We reverse the len-k elements that is last k elements
 * -Than we reverse remaining elements
 * -Finally we reverse the whole array after above two steps
 *
 * Time Complexity
 * It takes
 * O(k) - to reverse k elements
 * +
 * O(n-k) - to reverse remaining elements
 * +
 * O(n) - to reverse entire array
 *
 *time complexity will be O(2n) as in the first two steps it takes n iteration and than in the last step
 * it takes more n iteration
 *
 * Space Complexity
 * O(1) - as we are not using any new space
 *
 * */



