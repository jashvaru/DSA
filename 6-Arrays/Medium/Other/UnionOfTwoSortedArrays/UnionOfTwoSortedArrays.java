import java.util.*;
import java.util.stream.Collectors;

public class UnionOfTwoSortedArrays {

    public static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        Set<Integer> temp = new HashSet<>();
        Arrays.stream(arr1).forEach(a -> {
            temp.add(a);
        });
        Arrays.stream(arr2).forEach(a -> {
            temp.add(a);
        });


        Integer[] union = new Integer[temp.size()];
        union = temp.toArray(union);

        return temp.stream().mapToInt(a -> a).toArray();     
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 7};
        int[] union = unionOfTwoSortedArrays(arr1, arr2);
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + ", ");
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



