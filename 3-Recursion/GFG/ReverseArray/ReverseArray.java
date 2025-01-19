public class ReverseArray {
    
    static void reverseArray(int[] arr) {
        int end = arr.length - 1;
        int start = 0;
        fetch(start, end, arr);
    }


    static void fetch(int start, int end, int[] arr) {
        if(start > end) {
            return;
        }
        start++;
        end--;
        fetch(start, end, arr);
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
-As seen in below how this will work
[2,6,7,4] -swap(0,3)-> [4,6,7,2] -swap(1,2)-> [4,7,6,2]

Time complexity
O(n) - as base consition will be true at half of the array

Space complexity
O(n) - As each new method call will occupy new space in stack
 */



/* 
--Basic solution
public class ReverseArray {
    
    static void reverseArray(int[] arr) {
        int end = arr.length - 1;
        int start = 0;
        
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

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

Time complexity
Actual - O(n/2)
Not considering (1/2) - O(n) as while loop will run till half of the array

space complexity
O(1) - as we are using only temp var in each loop
 */


