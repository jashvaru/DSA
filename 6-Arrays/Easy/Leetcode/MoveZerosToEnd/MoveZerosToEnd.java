import java.util.Arrays;

public class MoveZerosToEnd {

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(index, i, nums);
                index++;
            }
        }
    }

    private static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
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



