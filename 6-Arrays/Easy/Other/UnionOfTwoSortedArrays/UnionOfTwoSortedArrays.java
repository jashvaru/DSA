import java.util.Arrays;

public class UnionOfTwoSortedArrays {

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
 * -I am using two pointers
 * -First pointer will act as the index where I want to get my non zero values towards left
 * -Second pointer will be to iterate throughout the array to check non zero values
 * -If my second pointer found a non zero value I will swap and move my index with 1 position, so that all non zero
 * values start filling the array from left
 *
 * Time Complexity
 * It takes
 * O(n) - as we iterate through entire array
 *
 * Space Complexity
 * O(1) - as we are not using any new space
 *
 * */



