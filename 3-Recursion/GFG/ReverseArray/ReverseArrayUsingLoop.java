public class ReverseArrayUsingLoop {
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

/* Time complexity
Actual - O(n/2)
Not considering (1/2) - O(n) as while loop will run till half of the array

space complexity
O(1) - as we are using only temp var in each loop */
