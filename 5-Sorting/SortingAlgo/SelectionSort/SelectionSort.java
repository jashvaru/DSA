public class SelectionSort {
 
    public static void selectionSort(int[] arr) {
        for(int i = 0; i <= arr.length-2; i++) {
            int min = i;
            for(int j = i+1; j <= arr.length-1; j++) {
                if(arr[j] < arr[i]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,2,6,1};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
