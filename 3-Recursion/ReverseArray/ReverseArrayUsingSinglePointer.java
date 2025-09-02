public class ReverseArrayUsingSinglePointer {
    static void reverseArray(int[] arr) {
        int start = 0;
        fetch(start, arr.length-start-1, arr); //using i-n-1
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
        int[] arr = {21, 30, 45, 01};
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
-This technique is called as single pointer as we increase start point and for end
we apply formula (n-start-1)
-As seen in below how this will work
[2,6,7,4] -swap(0,3)-> [4,6,7,2] -swap(1,2)-> [4,7,6,2]

Time complexity
O(n) - as base consition will be true at half of the array

Space complexity
O(n) - As each new method call will occupy new space in stack
 */
