public class ReverseArrayUsingTwoPointer {
    
    static void reverseArray(int[] arr) {
        int end = arr.length - 1;
        int start = 0;
        fetch(start, end, arr);
    }


    static void fetch(int start, int end, int[] arr) {
        if(start > end) {
            return;
        }
        fetch(start + 1, end - 1, arr);
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {21, 30, 45};
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        reverseArray(arr);
        System.out.println();
        for (int val : arr) {
            System.out.print(val + " ");
        }
        
    }
}

/*
Recursion
-we only need to iterate through the array till half of it.
-This technique is called as two pointer as we increase start point and decrease end point
-As seen in below how this will work
[2,6,7,4] -swap(0,3)-> [4,6,7,2] -swap(1,2)-> [4,7,6,2]

Time complexity
O(n) - as base consition will be true at half of the array

Space complexity
O(n) - As each new method call will occupy new space in stack
 */

//Time taken 20 mins
