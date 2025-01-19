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
